public class ContainsDuplicate {
    public static void main(String[] args) {
        String[] withDuplicates = new String[] {"one","two","three","one"};

        System.out.println(containsDuplicate(withDuplicates));
    }

    public static boolean containsDuplicate(String[] input){
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i].equals(input[j]) && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}