package com.company;


import java.util.HashSet;
import java.util.Set;

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
            System.out.println("Question 1: Write a program find if String is Palindrome?");
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Question 1: Write a program find if String is Palindrome?");
            System.out.println("Not a Palindrome");
        }

        // Question2: Write a program to check if a string has all unique characters.
        String str1 = "abcdef89012";
        System.out.println("Question2: Write a program to check if a string has all unique characters.");
        System.out.println(hasUniqueChars(str1));

        // Question 3. Write a program to check if string contains duplicates.
        String str2 = "How many duplicates are there?";
        System.out.println("Question 3. Write a program to check if string contains duplicates.");
        System.out.println(checkDupChars(str2));


    }


    /// region assignment code
    // Question2: Write a program to check if a string has all unique characters.
    private static boolean hasUniqueChars(String str){
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }

    // Question 3. Write a program to check if string contains duplicates.
    private static String checkDupChars(String str){
        String characters = "";
        String duplicates = "";

        for(int i = 0; i < str.length(); i ++){
            String current = Character.toString(str.charAt(i));
            if(characters.contains(current)){
                if(!duplicates.contains(current)){
                    duplicates += current;
                    System.out.println(duplicates);
                }
            }
            characters += current;
        }
        return duplicates;
    }











    ///endregion
}
