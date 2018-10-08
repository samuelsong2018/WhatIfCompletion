package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	double num1, num2;

        System.out.println("Enter your first number: ");
        num1 = input.nextDouble();

        System.out.println("Enter your second number: ");
        num2 = input.nextDouble();

        System.out.println("\nSum: ");
        double sum = num1+num2;
        if (sum>200){
            System.out.printf("%.2f* \n(*Your sum is over 200.)", sum);
        }
        else {
            System.out.printf("%.2f", sum);
        }

        System.out.println("\n\nProduct: ");
        double product = num1*num2;
        System.out.printf("%.2f", product);

        System.out.println("\n\nAverage: ");
        double average = (num1+num2)/2;
        System.out.printf("%.2f\n", average);
    }
}