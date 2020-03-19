package first2last.N001099.N001;

/*
1. Two Sum  E
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum1(int[] nums, int target) {
        /*  Runtime: 2 ms, faster than 98.74% of Java online submissions for Two Sum.
            Memory Usage: 36.9 MB, less than 99.08% of Java online submissions for Two Sum.
        */

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp) && map.get(temp) != i) {
                return new int[]{i, map.get(temp)};
            }
        }

        // for there is exactly one solution, no exceptional condition will occur.
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        /*
        Runtime: 2 ms, faster than 98.74% of Java online submissions for Two Sum.
        Memory Usage: 37.1 MB, less than 98.95% of Java online submissions for Two Sum.
        */

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(temp, i);
            }  // map contains all the numbers needed to be addressed with their indexes.
        }

        // for there is exactly one solution, no exceptional condition will occur.
        throw new IllegalArgumentException("No two sum solution");
    }
}