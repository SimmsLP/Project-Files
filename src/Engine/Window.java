package Engine;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Luke_Simmonds on 5/28/15.
 */
public class Window {

    private JFrame frame;
    private Canvas canvas;
    private String title;
    private int width, height, scale;

    public Window(String title, int width, int height, int scale) {
        this.title = title;
        this.width = width;
        this.height = height;
        this.scale = scale;

        createWindow();
    }

    public void createWindow() {
        frame = new JFrame(title);
        Dimension dim = new Dimension(width * scale, height * scale);
        frame.setMinimumSize(dim);
        frame.setMaximumSize(dim);
        frame.setPreferredSize(dim);
        frame.setFocusable(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        canvas = new Canvas();
        frame.add(canvas);
        frame.pack();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getScaledWidth() {
        return width * scale;
    }

    public int getScaledHeight() {
        return height * scale;
    }

    public int getScale() {
        return scale;
    }

    public JFrame getFrame() {
        return frame;
    }

    public Canvas getCanvas() {
        return canvas;
    }
}