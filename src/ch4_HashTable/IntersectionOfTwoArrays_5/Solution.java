package ch4_HashTable.IntersectionOfTwoArrays_5;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public int[] intersection(int[] nums1, int[] nums2) {

    Set<Integer> set = new HashSet<>();

    for (Integer i : nums1){
      if (!set.contains(i))
      set.add(i);
    }

    int count = 0;

    for (int i = 0; i < nums2.length; i++){
      if (set.contains(nums2[i])){
        set.remove(nums2[i]);
        count ++;
      }
      else {
        nums2[i] = Integer.MAX_VALUE;
      }
    }

    int[] res = new int[count];
    count = 0;

    for (Integer i : nums2){
      if (i != Integer.MAX_VALUE){
        res[count] = i;
        count++;
      }
    }

    return res;
  }
}
