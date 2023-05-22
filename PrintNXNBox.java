/*

    Log2Base2 Task:
    Given an input number n you need to print an n x n box of stars

 */

import java.util.Scanner;

public class PrintNXNBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i, j;
        
        //Write your code here
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
    
}
