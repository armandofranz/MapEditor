package org.academiadecodigo.maindalorians.representables;

public class GridCell extends Cell {
    private boolean painted;

    public GridCell(int col, int row) {
        super(col, row);
        painted = false;
    }

    public boolean isPainted() {
        return painted;
    }

    public void paint() {
        painted = true;
        representation.fill();
    }

    public void unpaint() {
        painted = false;
        representation.draw();
    }

    @Override
    public String toString() {
        return painted ? "1" : "0";
    }
}
