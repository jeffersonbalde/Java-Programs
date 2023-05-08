/*

    Write a method that prints a given String backwards
    For example, if given "pots", it prints "stop".

 */

public class BackwardString {
    public static void main(String[] args) {
        reverseString("Hello World");
    }

    public static void reverseString(String text) {
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
