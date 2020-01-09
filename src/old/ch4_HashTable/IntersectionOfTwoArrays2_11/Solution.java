package old.ch4_HashTable.IntersectionOfTwoArrays2_11;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {

    Map<Integer,Integer> map = new HashMap<>();

    for (int i = 0; i < nums1.length; i++){
      int temp = nums1[i];
      if (map.containsKey(temp)){
        map.put(temp, map.get(temp)+1);
      }
      else map.put(temp, 1);
    }

    int count = 0;

    for (int i = 0; i < nums2.length; i++){
      int temp = nums2[i];
      if (map.containsKey(temp) && map.get(temp) > 0){
        map.put(temp, map.get(temp) -1);
        nums2[count] = temp;
        count ++;
      }
    }

    int[] res = new int[count];
    for (int i = 0; i < count; i++){
      res[i] = nums2[i];
    }

    return res;
  }
}
