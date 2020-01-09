package old.ch4_HashTable.ContainsDuplicate_3;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public boolean containsDuplicate(int[] nums) {

    Set<Integer> set = new HashSet<>();

    for (Integer i : nums){
      if (set.contains(i)) return true;
      set.add(i);
    }

    return false;
  }
}
