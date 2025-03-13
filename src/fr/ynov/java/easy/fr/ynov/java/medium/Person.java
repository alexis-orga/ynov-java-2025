package fr.ynov.java.medium;

import java.util.Scanner;

public class Person {

    private String name;
    private Integer age;
    private String gender;
    private float height;
    private float weight;
    private Nationality nationality;

    public Person (String name, Integer age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + "m");
        System.out.println("Weight: " + weight + "kg");
        System.out.println("Nationality: " + nationality);
    }
    public static void main(String[] args) {
        Person person = new Person("John", 12, "Homme", (float) 1.76, 80, Nationality.FRENCH);
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