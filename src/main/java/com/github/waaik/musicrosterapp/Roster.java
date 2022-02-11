package com.github.waaik.musicrosterapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Roster {
    String[] roles = new String[102];
    public Roster(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            int i = 0;
            while (scanner.hasNext()){
                roles[i] = scanner.next(); //Starting at 0, for every role is gonna move up a number
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
