/*
    
    Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

 */

 import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Input a value for inch: ");
        double inch = scanner.nextDouble();

        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");
    }
}
