package Hmwk3;

import java.util.Random;
import java.util.Scanner;

public class UserDefinedMatrixP3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This Program will generate 2d array with random numbers.\nThe table will be as big as user defines it.");
        System.out.println();
        System.out.println("Input Rows count (whole Number):");
        int rows = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Columns count (whole Number):");
        int columns = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[rows][columns];

        Random rand = new Random();
        int filler;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                filler = rand.nextInt(65000);
                System.out.print(filler+ ",");
                if (j == arr[i].length -1){
                    System.out.println();
                }
            }
        }
    }
}
