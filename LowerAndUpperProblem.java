/*

    Log2Base2 Task:
    Given an string you have to convert all uppercase to lowercase and all lowercase to uppercase

 */
import java.util.Scanner;

public class LowerAndUpperProblem {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextLine();
        sc.close();
        char[] str = temp.toCharArray();
        
        //Write your code here
        int length = 0;
    
        for(char i : str)
            length += 1;
    
        for(int i = 0; i < length; i++) {
            if(str[i] >= 'a' && str[i] <= 'z')
                str[i] -= 32;
            else if(str[i] >= 'A' && str[i] <= 'Z')
                str[i] += 32;
        }
    
        System.out.println(str);
    }
}
