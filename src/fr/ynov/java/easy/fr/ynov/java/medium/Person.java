package fr.ynov.java.medium;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {

    private String name;
    private LocalDate birthDate;
    private String gender;
    private float height;
    private float weight;
    private Nationality nationality;

    public Person (String name, LocalDate birthDate, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + getAge());
        System.out.println("Birth Date: " + birthDate);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Nationality: " + nationality);
    }
    public static void main(String[] args) {
        Person person = new Person("Alexis", LocalDate.of(2002, 5, 29), "Homme", (float) 1.76, 62, Nationality.FRENCH);
        person.displayInfo();
    }
}

enum Nationality {
    FRENCH,
    AMERICAN,
    BRITISH,
    GERMAN,
    SPANISH
}