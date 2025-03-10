package fr.ynov.java.easy;

import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) { 
        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an operator ( +, -, *, /)");
        operator = input.next().charAt(0);
        System.out.println("Enter a number : ");
        number1 = input.nextDouble();
        System.out.println("Enter a number : ");
        number2 = input.nextDouble();

        switch (operator) {
            case '+' :
            result = number1 + number2;
            System.out.println(result);
            break;

            case '-':
            result = number1 - number2;
            System.out.println(result);
            break;

            case '*':
            result = number1 * number2;
            System.out.println(result);
            break;

            case '/':
            result = number1 / number2;
            System.out.println(result);
            break;
        }
    }  
}
