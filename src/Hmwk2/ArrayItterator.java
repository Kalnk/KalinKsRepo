package Hmwk2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayItterator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array lenght:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        int i = 0;
        while (i<arr.length){
            System.out.println("Enter next number:");
            arr[i] = scanner.nextInt();
            i++;
        }

        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for (int k = 0; k <arr.length ; k++) {
            int current = arr[k];
            if(current > 150){
                break;
            }
            if (current % 5 == 0){
                newArr.add(current);
            }
        }

        System.out.println("new array:" + newArr);
    }
}
