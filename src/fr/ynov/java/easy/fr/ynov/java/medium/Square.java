package fr.ynov.java.medium;

import java.util.Scanner;

public class Square {

    public static int square(int number){
        return number * number;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number : ");
        Integer number = input.nextInt();
        int result = square(number);
        System.out.println("Square is : " + result);
    }
}    
