package old.ch4_HashTable.HappyNumber_6;

import java.util.HashSet;
import java.util.Set;

public class Solution {
  public boolean isHappy(int n) {

    Set<Integer> set = new HashSet<>();

    while (set.add(n)){

      int res = n;
      while ( n > 0){
        res = res + (n % 10) * (n % 10);
        n = n / 10;
      }
      if (n == 1) return true;
      n = res;
    }
    return false;
  }
}