/*

    Log2Base2 Task:
    Given an input number you need to check if it is a prime number or not

 */

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        //Write your code here
        int flag = 0;
        
        for(int i = 2; i < num; i++){
            if(num % i == 0){
                flag = 1;
                break;  
            }
        }
        
        if(flag == 0) System.out.println("Prime number");
        else System.out.println("Not Prime number");
    }
}
