package Other;

import Engine.GameEngine;

import java.util.ArrayList;

/**
 * Created by Luke_Simmonds on 5/28/15.
 */
public class DrawGrid {
    private int xStart, yStart;
    private ArrayList<Tile> tileList;

    public DrawGrid(int xStart, int yStart) {
        this.xStart = xStart;
        this.yStart = yStart;
        init();
    }

    private void init() {
        tileList = new ArrayList<>();
        int numTilesAcross = 0;

    }
}
