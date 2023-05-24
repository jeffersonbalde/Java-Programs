/*

    Log2Base Task:
    Given an array and you have search for particular element in that array

 */
import java.util.Scanner;

public class SearchAnElementInTheArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int n, i, key;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for (i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        key = sc.nextInt();
        sc.close();
        
        //Write your code here
        int flag = 0;
        
        for(i = 0; i < n; i++){
            if(arr[i] == key){
                flag = 1;
                break;
            }
        }
        
        if(flag == 1) System.out.println("Key found");
        else System.out.println("Key not found");
    }
}
