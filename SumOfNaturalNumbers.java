/*

    Log2Base2 Task:
    Given an input number find the first input natural number

*/

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
         
        //Write your code here
        int sum = 0;
        for(int i = 0; i <= N; i++){
            sum += i;
        }
        
        System.out.println(sum);
    }
}
