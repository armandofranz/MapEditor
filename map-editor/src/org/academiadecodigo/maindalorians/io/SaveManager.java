package org.academiadecodigo.maindalorians.io;

import java.io.*;

public class SaveManager {
    public static void saveGrid(String grid) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("save.txt"));
            writer.write(grid);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String readGrid() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("save.txt"));
        StringBuilder builder = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            builder.append(line + "\n");
        }
        reader.close();
        return builder.toString();
    }
}
