/*
 
    Write a method that adds spaces to a jumbled String where all words were written together
    with no spaces. Each new word begins with a capital letter

 */

public class JumbledString {
    public static void main(String[] args) {
        addSpaces("YouWillBecomeSoftwareEngineerSoon!");
    }

    public static void addSpaces(String text) {
        var modifiedText = new StringBuilder(text);
        for(int i=0; i<modifiedText.length(); i++) {
            if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
