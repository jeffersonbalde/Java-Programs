/* 

    Log2Base2 Task:
    Given two input number check if a second number is a factor of a second number

 */


import java.util.Scanner;

public class FactorOfANumber {
    public static void main(String[] args) {
        int N, X;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        X = sc.nextInt();
        sc.close();
        
        //Write your code here
        if(N % X == 0) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}