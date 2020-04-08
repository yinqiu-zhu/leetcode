package first2last.N2.N219ContainsDuplicate2;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public boolean containsNearbyDuplicate(int[] nums, int k) {
    if (nums.length == 0 || nums == null) return false;
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i ++){
      int temp = nums[i];
      if (map.containsKey(temp) &&i - map.get(temp) <= k) return true;
       map.put(temp,i);
    }

    return false;
  }
}
