package Hmwk2;

import java.util.Scanner;

public class TripAdvisor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your vacation type:");
        String vacationType = scanner.nextLine();
        boolean isValidVacation;
        isValidVacation = vacationType.equals("Beach") || vacationType.equals("Mountain");

        if (isValidVacation){
            System.out.println("Input budget per day:");
            double budget = Double.parseDouble(scanner.nextLine());
            switch (vacationType){
                case "Beach":
                    if (budget < 50){
                        System.out.println("Trip advisor, advices for Bulgaria");
                    }else {
                        System.out.println("Trip advisor, advices for vacation outside of Bulgaria");
                    }
                    break;
                case "Mountain":
                    if (budget < 30){
                        System.out.println("Trip advisor, advices for Bulgaria");
                    }else {
                        System.out.println("Trip advisor, advices for vacation outside of Bulgaria");
                    }

            }

        }else {
            System.out.println("No information for this vacation type");
        }
    }
}
