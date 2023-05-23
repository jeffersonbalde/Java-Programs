/*

    Log2Base2 Task:
    Given an array you have to count odd and even numbers in that array

 */

import java.util.Scanner;

public class CountOddAndEvenElements {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size, i;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
    
        for(i = 0; i < size; i++)
            arr[i] = sc.nextInt();
    
        //Write your code here
        int odd_count = 0, even_count = 0;
    
        for(i=0; i < size; i++) {
            if(arr[i] % 2 == 0) even_count++;
            else odd_count++;
        }
    
        System.out.println("Even Number Count = " + even_count + "\n" + "Odd Number Count = " + odd_count);
        sc.close();
    }
}
