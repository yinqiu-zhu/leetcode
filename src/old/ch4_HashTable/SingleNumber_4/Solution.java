package old.ch4_HashTable.SingleNumber_4;


import java.util.HashSet;
import java.util.Set;

public class Solution {

  public int singleNumber(int[] nums){
    Set<Integer> set = new HashSet<>();

    for (Integer i : nums){
      if ( !set.contains(i) ) set.add(i);
      else set.remove(i);
    }

    int res = 0;
   for ( Integer i : set){
     res = i;
   }

   return res;
  }
}
