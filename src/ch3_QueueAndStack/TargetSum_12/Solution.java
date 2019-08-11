package ch3_QueueAndStack.TargetSum_12;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int findTargetSumWays(int[] nums, int S) {

    if (nums == null || nums.length == 0) return 0;

    Map<Integer,Integer> map = new HashMap<>();
    if (nums[0] == 0) map.put(0,2);
    else {
    map.put(nums[0],1);
    map.put(-nums[0],1);}
    for (int i = 1; i < nums.length; i++){
      int cur = nums[i];
      Map<Integer,Integer> curMap = new HashMap<>();

      for (Map.Entry<Integer,Integer> entry : map.entrySet()){

        int plus = entry.getKey() + cur;
        int minus = plus - cur -cur;

        if (curMap.containsKey(plus))
          curMap.put(plus, entry.getValue()+curMap.get(plus));
        else curMap.put(plus,entry.getValue());

        if (curMap.containsKey(minus))
          curMap.put(minus, entry.getValue()+curMap.get(minus));
          else curMap.put(minus, entry.getValue());
      }

      map = curMap;

      for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
        System.out.print(entry.getKey()+",");
        System.out.println(entry.getValue());
      }
      System.out.println('.');
    }

    if (map.containsKey(S)) return map.get(S);
    else return 0;
  }

  public static void main(String[] args) {
    int[] arr = {0,0,0,0,0,0,0,0,1};
    Solution one = new Solution();
    System.out.println(
    one.findTargetSumWays(arr,1));
  }
}