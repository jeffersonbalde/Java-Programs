/*

    LeetCode Problem: 

    Given an array of integers nums and an integer target, 
    return indices of the two numbers such that they add up to target.

 */

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int[] input = twoSum(nums, 9);
        
        for (int num : input) {
            System.out.print(num + " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {};
    }
}