/*

    Log2Base2 Task:
    You have to count the number of vowels in a given string

 */

import java.util.Scanner;

public class CountVowelsInAString {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.next();
        sc.close();
        
        char[] str = temp.toCharArray();
        
        //Write your code here
        int sumofVowels = 0;
        
        for(char i: str){
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
            sumofVowels++;
        }
    
        System.out.println(sumofVowels);
    }
}
