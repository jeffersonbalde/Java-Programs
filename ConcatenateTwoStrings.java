/*

    Log2Base2 Task:
    Given two input strings you have to concatenate two strings

 */
import java.util.Scanner;

public class ConcatenateTwoStrings {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextLine();
        char[] str1 = temp.toCharArray();
        temp = sc.nextLine();
        char[] str2 = temp.toCharArray();
        sc.close();
    
        //Write your code here
        String copyStr = "";
    
        for (char i : str1) {
            copyStr += i;
        }
    
        for (char i : str2) {
            copyStr += i;
        }
        
        System.out.println(copyStr);
    }
}
