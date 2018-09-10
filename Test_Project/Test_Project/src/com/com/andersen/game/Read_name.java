package com.com.andersen.game;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Read_name {
    List<String> lines = null;

    String file = "/Users/uzer/Downloads/Test_Project_0/Test_Project/Test_Project/src/com/com/andersen/game/Names.txt";
            //"uzer\\Загрузки\\Test_Project_0\\Test_Project\\Test_Project\\src\\com\\com\\andersen\\game\\\\Names.txt";

    public String readNameFromFile() {
        try {
            lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("File'Names of heroes' not found");
        }
        int randomIndexStr = getRandomNumber(0, lines.size());
        return lines.get(randomIndexStr);
    }

    private int getRandomNumber (int min, int max) {
        return min + (int) (Math.random() * ((max - min)));
    }


}
