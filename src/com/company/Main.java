package com.company;
import java.util.Scanner;

/**
 * Almamat #WomenInTech, Sprint 7, task 07010
 * Cod by Nina Belyavskaya
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Almamat! I'm Nina)");
        System.out.println('\n' + "Colories counting for women" +'\n' + "---------------------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.println ("Enter your body mass (kg): ");
        double bodyMass = keyboard.nextInt();
        System.out.println ("Enter your growth (cm): ");
        double growth = keyboard.nextInt();
        System.out.println ("Enter your age (years): ");
        double age = keyboard.nextInt();
        double caloTotal = 655.1+9.6*bodyMass+1.85*growth-4.68*age;
        System.out.println("Your norm is " + caloTotal + " kcal");
    }
}
