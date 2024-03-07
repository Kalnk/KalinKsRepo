package Hmwk3;

import java.util.LinkedList;
import java.util.Scanner;

public class ReverseLinkedListP5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input size:");

        int n = Integer.parseInt(scanner.nextLine());
        System.out.println("start inputing values:");

        LinkedList<Integer> input = new LinkedList<>();

        for (int i = 0; i <n ; i++) {
            input.add(Integer.parseInt(scanner.nextLine()));
        }

        for (int i = 0; i <input.size(); i++) {
            int last = input.getLast();
            input.removeLast();
            input.add(i,last);
        }

        System.out.println(input);
    }

}
