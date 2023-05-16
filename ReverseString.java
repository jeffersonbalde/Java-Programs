/*

    Write a java program that reverse a string based on a user input

 */


import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("ENTER STRING TO BE REVERSE: ");
        String input = scanner.next();

        StringBuilder stringBuilder = new StringBuilder(input);

        System.out.println(stringBuilder.reverse());
    }
}