// All salespeople get a payment of $1000 for the week
// Salespeople who exceed 10 sales get an additional bonus of $250. 

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salary = 1000;
        double bonus = 200;
        int quota = 10;
        int sales;

        System.out.println();
        System.out.println("How many sales did the employee get this week? ");
        sales = input.nextInt();
        input.close();

        if(sales > quota) {
            salary = salary + bonus;
        }

        System.out.println("Salary: " + salary);
    }
}