package Other;

import java.awt.*;

/**
 * Created by Luke_Simmonds on 5/28/15.
 */
public class Grid {
    private int width, height, rows, columns;

    public Grid(int width, int height, int rows, int columns) {
        this.width = width;
        this.height = height;
        this.rows = rows;
        this.columns = columns;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, width, height);

        //Draw Grid
        int htOfRow = height / (rows);
        for (int k = 0; k < rows; k++) {
            g.setColor(Color.black);
            g.drawLine(0, k * htOfRow, width, k * htOfRow);
        }

        int wdOfRow = width / (columns);
        for (int k = 0; k < columns; k++) {
            g.setColor(Color.black);
            g.drawLine(k * wdOfRow, 0, k * wdOfRow, height);
        }
    }

    public int getRowHeight() {
        return height / (rows);
    }

    public int getRowWidth() {
        return width / (columns);
    }
}
