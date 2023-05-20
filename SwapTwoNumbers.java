/*

    Log2Base2 Task:
    Given two input numbers you have to swap them

 */

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        a = sc.nextInt();
        System.out.print("b: ");
        b = sc.nextInt();
        sc.close();
    
        //Write your code here
        int temp;
    
        temp = a;
        a = b;
        b = temp;
    
        System.out.println("a " + a);
        System.out.println("b " + b);
    }
 }