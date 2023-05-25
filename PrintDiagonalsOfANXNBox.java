/*

    Log2Base2 Task:
    Given an input number n you need to print diagonals of a n x n box

 */

import java.util.Scanner;

public class PrintDiagonalsOfANXNBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i, j;
    
        //Write your code here
        for(i = 1; i <= n; i++){
            for(j = 1; j <= n; j++){
                if(i == j || i + j == n+1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
