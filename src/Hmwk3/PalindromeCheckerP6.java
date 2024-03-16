package Hmwk3;

import java.util.Scanner;

public class PalindromeCheckerP6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Palindrome candidate here:");
        String input = scanner.nextLine();
        String reverse = new PalindromeCheckerP6().reverseString(input);
        new PalindromeCheckerP6().isPalindromeString(input, reverse);
    }

    private String reverseString (String input){
        StringBuilder reverse = new StringBuilder();
        for (int i = input.length() - 1 ; i >= 0 ; i--) {
            char current = input.charAt(i);
            reverse.append(current);
        }
        return reverse.toString();
    }

    private void isPalindromeString (String input, String reverse){
        boolean isPalindrome = input.equals(reverse);
        if (isPalindrome){
            System.out.println(input+" is Palindrome");
        }else{
            System.out.println(input+" is not Palindrome");
        }

    }

}
