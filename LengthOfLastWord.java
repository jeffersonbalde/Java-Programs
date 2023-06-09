/*

    Given a string s consisting of words and spaces, 
    return the length of the last word in the string.

 */

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(LengthOfLastWord("Hello World")); 
    }

    public static int LengthOfLastWord(String s){
        String[] words = s.split(" ");
        int length = 0;
        for(int i = words.length - 1; i >= 0; i--){
            length = words[i].length();
            break;
        }

        return length;
    }
}