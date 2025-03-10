package fr.ynov.java.easy;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) { 
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter a number : ");
        Integer number = myNumber.nextInt();

        if ((number % 2) == 0) {
            System.out.println("Its Even");
        } else {
            System.out.println("Its Odd");
        }
    }
}