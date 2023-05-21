/*

    Log2Base2 Task:
    Given an input number check if it is a palindrome number or not

 */

import java.util.Scanner;

public class PalindromeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        //Write your code here
        int result = 0;
        int temp = num;
        
        
        while(num > 0){
            int remainder = num % 10;
            result = result * 10 + remainder;
            num = num / 10;
        }
        
        if(temp == result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}