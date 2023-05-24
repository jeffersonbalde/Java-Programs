/*

    Log2Base2 Task:
    You have to find the length of the given string without using the string length function 

 */

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextLine();
        sc.close();
    
        char[] str = temp.toCharArray();
    
        //Write your code here
        int length = 0;
    
        for(char i : str)
            length++;
    
        System.out.println(length);
    }
}
