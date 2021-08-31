package org.academiadecodigo.maindalorians;

import org.academiadecodigo.maindalorians.keyboard.KeyboardManager;
import org.academiadecodigo.maindalorians.representables.Cursor;
import org.academiadecodigo.maindalorians.representables.Grid;

public class Main {
    public static void main(String[] args) {
        Grid grid = new Grid(20,20);
        Cursor cursor = new Cursor();

        MapManager mvp = new MapManager(grid, cursor);

        KeyboardManager.init(mvp);

    }
}
