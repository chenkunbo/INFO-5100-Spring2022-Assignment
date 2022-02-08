package com.company;


public class Main {

    public static void main(String[] args) {

        // Question 1: Write a program find if String is Palindrome?
        String str = "intni";

        int start = 0;
        int end = str.length() - 1;

        boolean isPalindrome = true;

        while(start < end){
            if (str.charAt(end) != str.charAt(start)) {
                isPalindrome = false;
                break;
            }
            start ++;
            end --;
        }
        if(isPalindrome){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    /// region Assignment Code
    // Question 1: Write a program find if String is Palindrome?














    ///endregion
}
