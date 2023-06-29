/*

    You will be given two string and you have compare this two strings 

 */

import java.util.Scanner;

public class CompareTwoStringsProblem {
    public static void main(String[] args) {
        String temp;
        Scanner sc = new Scanner(System.in);
        temp = sc.nextLine();
        char[] str1 = temp.toCharArray();
        temp = sc.nextLine();
        char[] str2 = temp.toCharArray();
        sc.close();
        
        int length1 = 0;
        int length2 = 0;
        int status = 0;

        for(char i: str1){
            length1++;
        }

        for(char i: str2){
            length2++;
        }

        if(length1 == length2){
            for(int i = 0; i < length1; i++){
                if(str1[i] != str2[i]){
                    status = 1;
                    System.out.println("No");
                    break;
                }
            }

            if(status == 0){
                System.out.println("Yes");
            }
        }else {
            System.out.println("No");
        }
        
    }
}
