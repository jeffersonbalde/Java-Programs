/*

    Log2Base2 Task:
    Given 2 dimensional array and you have to find the sum of elements in that 2 dimensional array

 */

import java.util.Scanner;

public class SumOf2DArray {
    public static void main(String[] args) {
        int n, i, j;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[][] = new int[n][n];

        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();
        
        //Write you code here
        int sum = 0;

        for(i = 0; i < n; i++)
            for(j = 0; j < n; j++)
                sum += arr[i][j];

        System.out.println(sum);
    }
}
