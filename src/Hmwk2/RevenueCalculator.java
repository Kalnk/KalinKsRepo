package Hmwk2;

import java.util.Scanner;

public class RevenueCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Еnter unit price:");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter quantity:");
        int count = Integer.parseInt(scanner.nextLine());

        double revenue = price * count;
        double finalRevenue;
        double discount = 0;
        double percentDiscount = 0;
        if (count > 120){
            finalRevenue = revenue * 0.8;
            discount = revenue - finalRevenue;
            percentDiscount = 20;
        }else if (count >=100){
            finalRevenue = revenue * 0.85;
            discount = revenue - finalRevenue;
            percentDiscount = 15;
        } else {
            finalRevenue = revenue;
        }

        System.out.printf("The revenue from sale: %.1f$\n", finalRevenue);
        if (percentDiscount >= 15) {
            System.out.printf("Discount: %.1f$(%.1f%%)", discount, percentDiscount);
        } else {
            System.out.println("No discount");
        }
    }
}
