/*

    Log2Base2 Task:
    Given an array you have to reverse it

 */
import java.util.Scanner;

public class ReverseTheArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        //Write your code here
        int lastIndex = n - 1;
        
        for(i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[lastIndex - i];
            arr[lastIndex - i] = temp;
        }
        
        for(i = 0; i < n ; i++) System.out.print(arr[i] + " ");
        sc.close();
    }
}
