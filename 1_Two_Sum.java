import java.util.HashMap;

// Two Sum
// https://leetcode.com/problems/two-sum/

// Given an array of integers, return indices of the two numbers such that they add up to a specific target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// Example:
// Given nums = [2, 7, 11, 15], target = 9,
// Because nums[0] + nums[1] = 2 + 7 = 9,
// return [0, 1].

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int j = 0; j < nums.length; j++) {
            int temp = target - nums[j];
            if (hash.containsKey(temp) && hash.get(temp) != j) {
                return new int[] { j, hash.get(temp) };
            }
        }
        return null;
    }
}

// Runtime: 2 ms, faster than 99.00% of Java online submissions for Two Sum.
// Memory Usage:37.8 MB, less than 99.38% of Java online submissions for Two
// Sum.

// @YIMING DAI - 2019.06.22
