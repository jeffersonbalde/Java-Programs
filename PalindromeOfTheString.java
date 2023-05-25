/*

    Log2Base2 Task:
    Given a string you have to check if it is palindrome or not

 */
import java.util.Scanner;

public class PalindromeOfTheString {
    static int length(char[] str) {
        int count = 0;
    
        for(char i : str)
            count += 1;
    
        return count;
    }
    public static void main(String[] args) {
        String t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextLine();
        sc.close();
        char[] str = t.toCharArray();
        
        //Write your code here
        int len = length(str);
        int lastIndex = len-1;
        int flag = 1;
    
        for(int i = 0; i < len/2; i++)
            if(str[i] != str[lastIndex-i]) {
                flag = 0;
                break;
            }
    
        if(flag == 1) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
