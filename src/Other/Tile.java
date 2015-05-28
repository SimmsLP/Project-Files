package Other;

import java.awt.*;

/**
 * Created by Luke_Simmonds on 5/28/15.
 */
public class Tile extends Rectangle {
    private int xPos;
    private int yPos;
    private int width;
    private int height;

    public static final int TILE_WIDTH = 64;
    public static final int TILE_HEIGHT = 64;

    public Tile(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.width = TILE_WIDTH;
        this.height = TILE_HEIGHT;
        setBounds(xPos, yPos, width, height);
    }

    public void render(Graphics g) {
        g.setColor(Color.black);
        g.drawRect(this.x, this.y, this.width, this.height);
    }
}
