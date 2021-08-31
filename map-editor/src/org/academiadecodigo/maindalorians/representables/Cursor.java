package org.academiadecodigo.maindalorians.representables;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    private static final int STARTING_COL = 0;
    private static final int STARTING_ROW = 0;

    private int col;
    private int row;

    public Cursor() {
        super(STARTING_COL, STARTING_ROW);
        representation.fill();
        representation.setColor(Color.MAGENTA);
        col = STARTING_COL;
        row = STARTING_ROW;
    }

    public void moveUp() {
        representation.translate(0, -Grid.CELL_SIZE);
        row--;
    }

    public void moveDown() {
        representation.translate(0, Grid.CELL_SIZE);
        row++;
    }

    public void moveLeft() {
        representation.translate(-Grid.CELL_SIZE, 0);
        col--;
    }

    public void moveRight() {
        representation.translate(Grid.CELL_SIZE, 0);
        col++;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }
}
