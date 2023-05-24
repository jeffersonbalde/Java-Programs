/*

    Log2Base Task:
    Given an input string you have to copy the given string

 */

import java.util.Scanner;

public class StringCopy {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextLine();
        sc.close();

        char[] str = temp.toCharArray();

        // Write your code here
        String copyStr = "";

        for (char i : str) {
            copyStr += i;
        }

        System.out.println("Copied string = " + copyStr);
    }
}
