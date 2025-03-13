package fr.ynov.java.medium;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File myObj = new File("ynov-java-2025\\src\\fr\\ynov\\java\\easy\\fr\\ynov\\java\\medium\\trucalire");
        File[] files = myObj.listFiles();
        if (files != null) {
            for (File file : files) {
                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }
                } catch (IOException e) {
                    System.out.println("Error reading file: " + file.getName());
                    e.printStackTrace();
                }
            }
        }
    }
}
