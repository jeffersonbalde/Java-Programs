/**
 * All salespeople are expected to make at least 10 sales each week. 
 * For those who do, they receive a congratulatory message. For those
 * who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaGenerator {
    public static void main(String[] args) {
        int quota = 10;

        System.out.println();
        System.out.println("Enter the number of sales mode");
        Scanner input = new Scanner(System.in);
        int sales  =  input.nextInt();
        input.close();

        if(sales >= quota) {
            System.out.println("Congrats! You've meet your quota");
        }else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. " + "You were " + salesShort + " sales short.");
        }
    }
}
