package org.academiadecodigo.maindalorians;

import org.academiadecodigo.maindalorians.io.SaveManager;
import org.academiadecodigo.maindalorians.representables.Cursor;
import org.academiadecodigo.maindalorians.representables.Grid;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.io.IOException;

public class MapManager implements KeyboardHandler {

    private Grid grid;
    private Cursor cursor;

    public MapManager(Grid grid, Cursor cursor) {
        this.grid = grid;
        this.cursor = cursor;
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_UP:
                if (cursor.getRow() == 0) {
                    return;
                }
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_DOWN:
                if (cursor.getRow() == grid.getRows() - 1) {
                    return;
                }
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_LEFT:
                if (cursor.getCol() == 0) {
                    return;
                }
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_RIGHT:
                if (cursor.getCol() == grid.getCols() - 1) {
                    return;
                }
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_SPACE:
                grid.paintCell(cursor.getCol(), cursor.getRow());
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_C:
                grid.clear();
                break;
            case KeyboardEvent.KEY_S:
                SaveManager.saveGrid(grid.toString());
                break;
            case KeyboardEvent.KEY_L:
                try {
                    grid.fromString(SaveManager.readGrid());
                } catch (IOException e) {
                    grid.clear();
                }
                break;
            case KeyboardEvent.KEY_Q:
                    System.exit(0);
        }
    }
}
