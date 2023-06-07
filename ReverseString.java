/*

    Write a java program that reverse a string based on a user input

 */


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println();
        System.out.println("ENTER STRING TO REVERSE: ");
        String input = scanner.next();

        // Method 1 using Stringbuilder
        // StringBuilder str = new StringBuilder(input);
        // System.out.println(str.reverse());

        // Method 2 using for loop
        String reverseString = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reverseString += input.charAt(i);
        }

        System.out.println(reverseString);
    }
}