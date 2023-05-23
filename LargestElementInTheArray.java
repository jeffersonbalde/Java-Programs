/*

    Log2Base2 Task:
    Given an array you have to find the largest number in that array

 */

import java.util.Scanner;

public class LargestElementInTheArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        //Write your code here
        int max = arr[0];
        
        for(i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
        System.out.println("Max = " + max);
        sc.close();
    }
}
