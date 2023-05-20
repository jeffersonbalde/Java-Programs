/*

    Log2Base2 Task:
    Find the absolute number of the negative number

 */

import java.util.Scanner;

public class NegativeToAbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        //Write your code here
        if(num < 0) {
            num = -num;
        }
        
        System.out.println(num);
    }
}
