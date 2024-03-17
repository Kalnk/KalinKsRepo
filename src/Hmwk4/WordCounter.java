package Hmwk4;

import java.util.Arrays;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("words count is: "+(new WordCounter().countWords(input)));
    }

    private int countWords (String input){
        int count;
        String[] arr = input.split("\\s+|/|:|;|\\)|\\\\|\\(|\\.");
        count = arr.length;
        return count;
    }

}
