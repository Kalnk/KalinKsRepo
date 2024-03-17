package Hmwk4;

import Hmwk3.PalindromeCheckerP6;

import java.util.Arrays;

public class PalindromeIntegerChecker {

    public static void main(String[] args) {

        System.out.println(new PalindromeIntegerChecker().isPalindrome(13454321));
    }

    private boolean isPalindrome (int a){
        boolean isPalindrome = false;
        if (a < 0){
            isPalindrome = false;
        } else {
            String palindromeCandidate = Integer.toString(a);
            StringBuilder reverse = new StringBuilder();
            for (int i = palindromeCandidate.length() -1 ; i >= 0 ; i--) {
                char current = palindromeCandidate.charAt(i);
                reverse.append(current);
            }
            if (palindromeCandidate.contentEquals(reverse)){
                isPalindrome = true;
            }


        }
        return  isPalindrome;
    }
}
