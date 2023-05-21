/*

    Log2Base2 Task:
    You have to get positive number from a user and you have to print the sum of digits of that number

 */


import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        
        //Write your code here
        int sum = 0;
        
        while(num > 0){
            int mod = num % 10;
            sum += mod;
            num = num / 10;
        }
        
        System.out.println(sum);
        
    }
}
