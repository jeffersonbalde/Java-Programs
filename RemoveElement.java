/*
    LeetCode Task:
    
    Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
    The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

 */


public class RemoveElement {
    public static void main(String[] args) {

        int[] n = {0,1,2,2,3,0,4,2};
        int re = removeElement(n, 2);

        System.out.println(re);

    }

    public static int removeElement(int[] num, int val) {
        int i = 0;

        for(int elem: num) {
            if(elem != val) {
                num[i] = elem;
                i++;
            }
        }
        return i;
    }
}