package org.academiadecodigo.maindalorians.representables;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public abstract class Cell {
    protected Rectangle representation;

    public Cell(int col, int row) {
        representation = new Rectangle(Grid.PADDING + col * Grid.CELL_SIZE, Grid.PADDING + row * Grid.CELL_SIZE, Grid.CELL_SIZE, Grid.CELL_SIZE);
        representation.draw();
    }
}
