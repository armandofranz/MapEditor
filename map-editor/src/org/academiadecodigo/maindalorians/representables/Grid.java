package org.academiadecodigo.maindalorians.representables;

public class Grid {

    public static final int PADDING = 10;
    public static final int CELL_SIZE = 20;

    private GridCell[][] cells;
    private int cols;
    private int rows;

    public Grid(int cols, int rows) {
        cells = createCells(cols, rows);
        this.cols = cols;
        this.rows = rows;
    }

    private GridCell[][] createCells(int cols, int rows) {
        GridCell[][] toReturn = new GridCell[rows][cols];
        for (int i = 0; i < toReturn.length; i++) {
            for (int j = 0; j < toReturn[i].length; j++) {
                toReturn[i][j] = new GridCell(j, i);
            }
        }
        return toReturn;
    }

    public void paintCell(int col, int row) {
        GridCell c = cells[row][col];
        if (c.isPainted()) {
            c.unpaint();
        } else {
            c.paint();
        }
    }

    public void clear() {
        for (GridCell[] line : cells) {
            for (GridCell c : line) {
                c.unpaint();
            }
        }
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Cell[] line : cells) {
            for (Cell c : line) {
                stringBuilder.append(c.toString());
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void fromString(String grid) {
        String[] lines = grid.split("\n");
        for (int i = 0; i < cells.length; i++) {
            String[] characters = lines[i].split("");
            for (int j = 0; j < cells[i].length; j++) {
                if (characters[j].equals("0")) {
                    cells[i][j].unpaint();
                } else {
                    cells[i][j].paint();
                }
            }
        }
    }
}
