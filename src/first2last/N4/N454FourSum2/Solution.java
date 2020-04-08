package first2last.N4.N454FourSum2;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

    if ( A.length == 0 || B.length == 0 || C.length == 0 || D.length == 0)
      return 0;

    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    for(int a : A)
      for(int b : B){
        int s = a+b;
        map.put( s, map.getOrDefault(s, 0)+1 );
      }

    int count = 0;

      for (int c : C)
        for (int d : D){
        count += map.getOrDefault(- c - d, 0);
      }

    return count;
  }
}