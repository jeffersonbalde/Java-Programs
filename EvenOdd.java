/*

    Log2Base Task:
    Check if the input number is even or odd

 */

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        //Write your code here
        if(num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
        
    }    
}
