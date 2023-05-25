/*

    Write an algorithm to reverse an array

 */

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        // logic
        int i = 0;
        int j = size - 1;

        while(i < j){
            // get the first element of the array
            int firstEl = arr[i];
            // assign the first to last
            arr[i] = arr[j];
            // assign the last to first
            arr[j] = firstEl;

            i++;
            j--;
        }

        for(int c: arr){
            System.out.print(c + " ");
        }
    }
}
