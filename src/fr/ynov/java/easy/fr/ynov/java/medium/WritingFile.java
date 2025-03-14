package fr.ynov.java.medium;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingFile {
    public static void main(String[] args) {
        String inputFilePath = "ynov-java-2025//src//fr//ynov//java//easy//fr//ynov//java//medium//writingfile.txt";
        String outputFilePath = "ynov-java-2025//src//fr//ynov//java//easy//fr//ynov//java//medium//writedfile.txt";

        StringBuilder fileContent = new StringBuilder();

        try {
            File inputFile = new File(inputFilePath);
            Scanner myReader = new Scanner(inputFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                fileContent.append(data).append("\n");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }

        try {
            File outputFile = new File(outputFilePath);
            if (outputFile.createNewFile()) {
                System.out.println("File created: " + outputFile.getName());
            } else {
                System.out.println("File already exist");
            }
            FileWriter myWriter = new FileWriter(outputFilePath);
            myWriter.write(fileContent.toString());
            myWriter.close();
            System.out.println("Successfully written to the file");
        } catch (IOException e) {
            System.out.println("Error occurred while writing the file");
            e.printStackTrace();
        }
    }
}
