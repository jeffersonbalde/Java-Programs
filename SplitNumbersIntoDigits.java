/*

    Log2Base2 Task:
    Given an input number you have to split it and print each digit of that number

 */


import java.util.Scanner;

public class SplitNumbersIntoDigits {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();

        //Write your code here
        while(num > 0)
        {
            int mod = num % 10;
            System.out.print(mod + " ");
            num = num / 10;
        }
    }
}