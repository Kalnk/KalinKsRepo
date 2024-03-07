package Hmwk3;

import java.util.ArrayList;
import java.util.Scanner;

public class StrongestWordP4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("This program  will show you which is the strongest word based on your input.\nInput each word and press enter\nTo stop input type 'END'\n'END' will not be counted:");
        String input = scanner.nextLine();
        ArrayList<String> entry = new ArrayList<>();

        while (!input.equals("END")){
            entry.add(input);
            input = scanner.nextLine();
        }


        String work = entry.toString();
        String[] words = work.split("^\\[|\\]$|, *");

        int max = 0;
        String strongestWord = "";

        for (int i = 0; i <words.length ; i++) {
            String currentWord = words[i];
            int sum = 0;

            for (int j = 0; j < currentWord.length() ; j++) {
                sum += currentWord.charAt(j);
            }

            if (sum > max){
                max = sum;
                strongestWord = currentWord;
            }
        }

        System.out.println("Strongest word is: "+strongestWord);


    }
}
