package old.ch4_HashTable.TopKFrequentElements_22;

import java.util.*;

public class Solution_old {
  public List<Integer> topKFrequent(int[] nums, int k) {

    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> freq = new LinkedList<>();

    for (int i : nums){

      if (map.containsKey(i)){
        int freq_i = map.get(i);
        freq.set(freq.indexOf(freq_i), freq_i + 1);
        map.put(i, freq_i+1);
      }
      else {
        map.put(i, 1);
        freq.add(1);
      }
    }

    Set<Integer> set = new HashSet<>();
    for (int j = 0; j < k; j ++){
      set.add(freq.get(j));
    }

    List<Integer> res = new LinkedList<>();


    return res;
  }
}
