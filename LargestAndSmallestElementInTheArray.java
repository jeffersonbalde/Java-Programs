/*

    Log2Base2 Task:
    Given an input array you have to find the largest and smallest element in that array

 */

import java.util.Scanner;

public class LargestAndSmallestElementInTheArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        //Write your code here
        int max = arr[0];
        int min = arr[0];

        for(i = 1; i < n; i++){
            if(arr[i] > max) max = arr[i];   
            
            if(arr[i] < min) min = arr[i];
        }
            
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        sc.close();
    }
}
