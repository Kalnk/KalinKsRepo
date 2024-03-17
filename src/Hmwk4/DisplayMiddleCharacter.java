package Hmwk4;

import java.io.OutputStream;
import java.util.Scanner;

public class DisplayMiddleCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the word:");
        String input = scanner.nextLine();
        if (input.length() % 2 == 0){
            System.out.print("Center characters are: ");
            System.out.println(new DisplayMiddleCharacter().isEven(input));
        }else {
            System.out.print("Center character is: ");
            System.out.println(new DisplayMiddleCharacter().isOdd(input));
        }
    }



    private String isEven (String input){
        StringBuilder outputS = new StringBuilder();
        if (input.length() % 2 == 0){
            for (int i = 0; i <input.length(); i++) {
                char current = input.charAt(i);
                if (i == input.length()/2 -1 || i == input.length()/2){
                    outputS.append(current);
                }
            }
        }
        return  outputS.toString();
    }

    private String isOdd (String input){
        StringBuilder outputS = new StringBuilder();
        if (input.length() % 2 != 0){
            for (int i = 0; i <input.length() ; i++) {
                char current = input.charAt(i);
                if(i == input.length()/2){
                    outputS.append(current);
                }
            }
        }
        return outputS.toString();
    }

}
