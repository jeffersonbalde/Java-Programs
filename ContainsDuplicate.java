/*

    Given an integer array nums, return true if any value appears at least twice in the array, 
    and return false if every element is distinct.

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,1};

        System.out.println(checkDuplicateUsingForLoop(nums));
        System.out.println(checkDuplicateUsingHashSet(nums));
    }

    // Method 1 using for loop
    public static boolean checkDuplicateUsingForLoop(int[] nums){
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        }

        return false;
    }

    // Method 2 using hashset
    public static boolean checkDuplicateUsingHashSet(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}