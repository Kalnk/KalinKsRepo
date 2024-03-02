package Hmwk2;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestValueInArr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter how many numbers you want to compare:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        int i = 0;
        while (i<arr.length){
            System.out.printf("Enter number (%d left): ",arr.length - i);
            arr[i] = scanner.nextInt();
            i++;
        }

        int max = Integer.MIN_VALUE;
        for (int k : arr) {
            if (k > max) {
                max = k;
            }
        }

        System.out.printf("Highest number in the current array is: %d",max);

    }
}
