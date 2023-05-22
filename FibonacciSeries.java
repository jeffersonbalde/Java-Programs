/*

    Log2Base2 Task:
    Given a positive number n and you have to print the first n terms in fibonacci series

 */

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    
        //Write your code here
        int a = 0, b = 1, c;
    
        for (int i = 1; i <= n; i++){
            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}