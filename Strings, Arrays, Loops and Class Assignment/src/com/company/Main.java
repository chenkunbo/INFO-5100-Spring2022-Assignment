package com.company;


import java.util.Arrays;
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

        // Question 4: Write a program to check if two strings are anagrams.
        String str3 = "java";
        String str4 = "avaj";
        System.out.println("Question 4: Write a program to check if two strings are anagrams.");
        System.out.println("Both strings are anagrams : " + anagramCheck(str3, str4));

        // Question 5:  Write a program to determine whether the year is a leap year or not.
        int year1 = 2200;
        int year2 = 2020;
        System.out.println("Question 5:  Write a program to determine whether the year is a leap year or not.");
        System.out.println(leapYear(year1));
        System.out.println(leapYear(year2));








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
                }
            }
            characters += current;
        }
        return duplicates;
    }

    // Question 4: Write a program to check if two strings are anagrams.
    private static boolean anagramCheck(String str1, String str2){
        char[] charArrayFromString1 = str1.toCharArray();
        char[] charArrayFromString2 = str2.toCharArray();
        Arrays.sort(charArrayFromString1);
        Arrays.sort(charArrayFromString2);

        return Arrays.equals(charArrayFromString1, charArrayFromString2);

    }

    // Question 5:  Write a program to determine whether the year is a leap year or not.
    private static int leapYear(int year){
        if(year % 400 == 0){
            System.out.println(" Leap year");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println(" Leap year");
        }
        else{
            System.out.println(" Not a Leap year");
        }
        return year;
    }













    ///endregion
}
