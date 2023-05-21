/*

    Log2Base2 Task:
    Given a positive number and you need to find its reverse

 */

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //Write your code here
        int ans = 0;
        
        while (num > 0){
            int mod = num % 10;
            ans = ans * 10 + mod;
            num = num / 10;
        }
        
        System.out.println(ans);
        
    }    
}
