/*
    
    Write a Java program to convert temperature from Fahrenheit to Celsius degrees.

 */

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree fahrenheit is equalt to " + celsius + " celsius");
    }    
}
