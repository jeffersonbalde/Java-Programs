/*

    Log2Base Task:
    Given an input number you need to check if it is a perfect number or not

 */

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    
        //Write your code here
        int result = 1;
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
            {
                if(n / i == i)
                    result = result + i;
                else
                    result = result + i + n / i;
            }
        }
    
        if(n == result)  System.out.println("Yes");
        else System.out.println("No");
    }
}
