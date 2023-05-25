/*

    Log2Base2 Task:
    Print the half pyramid of stars of the given size

 */

import java.util.Scanner;

public class PrintTheGivenPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int i, j;
        
        //Write your code here
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= i ; j++)
                System.out.print("*");
                System.out.println();
        }
    }
}
