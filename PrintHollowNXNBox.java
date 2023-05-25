/*

    Log2Base2 Task:
    Given an input number n you need to print a hollow n x n box stars

 */

import java.util.Scanner;

public class PrintHollowNXNBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i, j;
    
        //Write your code here
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                if(i == 1 || j == 1 || i == n || j == n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
