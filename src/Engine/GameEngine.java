package Engine;

import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 * Created by Luke_Simmonds on 5/28/15.
 */
public class GameEngine implements Runnable, GameInterface {
    private String gameTitle;
    private int version;
    private int width;
    private int height;
    private int scale;
    private int ratio;
    public static final int WideScreen = 0x0; //16 x 9 Aspect Ratio
    public static final int Square     = 0x1; // 4 x 3 Aspect Ratio

    private Window window;
    private static GameEngine gameEngine;

    private boolean isRunning;
    private int targetTime;
    private int frameCap;

    public GameEngine(String gameTitle, int version, int width, int ratio, int scale, int frameCap)  {
        this.gameTitle = gameTitle;
        this.version = version;
        this.width = width;
        this.scale = scale;
        if (ratio == WideScreen) this.height = width / 16 * 9;
        else this.height = width / 4 * 3;
        this.frameCap = frameCap;
        this.targetTime = 1000 / frameCap;
        init();
    }

    private void init() {
        window = new Window(gameTitle, width, height, scale);
    }

    public synchronized void start() {
        if (isRunning) {
            return;
        }
        isRunning = true;
        new Thread(this, "Connect Four Ver. " + version).start();
    }

    public synchronized void stop() {
        if (!isRunning) return;
        isRunning = false;
    }

    public void update() {

    }

    public void render() {
        BufferStrategy bs = window.getCanvas().getBufferStrategy();
        if (bs == null) {
            window.getCanvas().createBufferStrategy(3);
            return;
        }

        Graphics g = bs.getDrawGraphics();
        g.clearRect(0, 0, width, height);
        g.setColor(Color.black);
        g.fillRect(0, 0, width, height);
        //Render Game States Here
        g.dispose();
        bs.show();
    }

    @Override
    public void run() {
        isRunning = true;
        long start = 0;
        long elapsed = 0;
        long wait = 0;

        while (isRunning) {
            start = System.nanoTime();
            update();
            render();
            elapsed = System.nanoTime() - start;
            wait = targetTime - elapsed / 1000000;
            if (wait < 0) wait = 5;
            try {
                Thread.sleep(wait);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Window getWindow() {
        return window;
    }

    public static GameEngine getGameEngine() {
        return gameEngine;
    }
}
