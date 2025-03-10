package fr.ynov.java.easy;

import java.util.Scanner;

public class ScanMe {

    public static void main(String[] args) { 
        Scanner myName = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String username = myName.nextLine();

        Scanner myAge = new Scanner(System.in);
        System.out.println("Enter your age : ");
        String age = myAge.nextLine();
        System.out.println("You are " + username + ", you have " + age);
    }
    
}
