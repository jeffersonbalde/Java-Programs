import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        //Write your code here
        int sum = 0;
        int temp = num;
        
        while(num > 0){
            int mod = num % 10;
            sum = sum + mod * mod * mod;
            num = num / 10;
        }
        
        if(temp == sum) System.out.println("Armstrong number");
        else System.out.println("Not Armstrong number");
     
    }
    
}
