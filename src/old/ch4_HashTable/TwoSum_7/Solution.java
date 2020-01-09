package old.ch4_HashTable.TwoSum_7;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {

    Map<Integer,Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++){
      int temp = target - nums[i];
      if (map.containsKey(temp)) return new int[]{map.get(temp), i};

      map.put(i,nums[i]);
    }

    return null;
  }
}

//class Solution {
//  public int[] twoSum(int[] nums, int target) {
//
//    Map<Integer,Integer> map = new HashMap<>();
//
//    for (int i = 0; i < nums.length; i++){
//      int temp = target - nums[i];
//      for (Map.Entry<Integer,Integer> entry : map.entrySet()){
//        if (entry.getValue() == temp) return new int[]{entry.getKey(),i};
//      }
//      map.put(i,nums[i]);
//    }
//
//    return null;
//  }
//}