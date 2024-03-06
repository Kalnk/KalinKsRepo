package Hmwk3;


import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayElementsP1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much element do you want to sum?");
        int n = Integer.parseInt(scanner.nextLine());

        //check if array is possible at all
        if (n <= 0){
            System.out.println("Invalid input, input should be 1 or more");
            return;
        }

        //create array object
        int[] arr = new int[n];
        //int needed to store the sum
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            System.out.println("Input Element "+ (i+1) + ":");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("\nThe total is :" +sum);

    }
}
