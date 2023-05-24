/*

    Log2Base2 Task:
    Given two numbers as input you need to check if this numbers are the same or not using bitwise

 */

import java.util.Scanner;

public class FindEqualOrNotUsingBitwise {
    public static void main(String[] args) {
        int num1, num2;
    
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sc.close();
        
        //Write your code here
        if((num1 ^ num2) == 0) System.out.println("Equal");
        else System.out.println("Unequal");
    }
}
