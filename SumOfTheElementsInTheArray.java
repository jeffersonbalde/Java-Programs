/*

    Log2Base2 Task:
    Given an array you have to find the sum of elements in the array

 */
import java.util.Scanner;

public class SumOfTheElementsInTheArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        //Write your code here
        int sum = 0;
        
        for(i = 0; i < arr.length; i++) sum += arr[i];
        
        System.out.println(sum);
        sc.close();
    }
}
