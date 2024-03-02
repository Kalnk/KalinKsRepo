package Hmwk2;

import java.util.Scanner;

public class SimpleEligibilityChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your current age:");
        int age = Integer.parseInt(scanner.nextLine());

        if (age >= 16){
            System.out.println("You are eligible to work!");
        } else {
            System.out.println("You are not eligable to work, sorry");
            if (age >= 0) {
                System.out.printf("Try again in %d years", 16 - age);
            }
        }
    }
}
