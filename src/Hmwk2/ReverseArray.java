package Hmwk2;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Array lenght:");
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];

        int p = 0;
        while (p<arr.length){
            System.out.printf("Input element %d: ", p + 1);
            arr[p] = scanner.nextInt();
            p++;
        }

        ArrayList<Integer> newArr = new ArrayList<Integer>();

        for (int i = arr.length -1; i >-1 ; i--) {
            int current = arr[i];
            newArr.add(current);
        }

        System.out.println("new array"+newArr);
    }
}
