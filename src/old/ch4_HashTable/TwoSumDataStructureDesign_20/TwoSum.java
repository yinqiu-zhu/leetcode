package old.ch4_HashTable.TwoSumDataStructureDesign_20;


import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  /** Initialize your data structure here. */

  Map<Integer,Integer> map;
  public TwoSum() {
    map  = new HashMap<>();
  }

  /** Add the number to an internal data structure.. */
  public void add(int number) {

    map.put(number, map.getOrDefault(number, 0) + 1);
  }

  /** Find if there exists any pair of numbers which sum is equal to the value. */
  public boolean find(int value) {

    for (Map.Entry<Integer, Integer> entry : map.entrySet()){
      int val = entry.getKey();
      if (value == val * 2 && entry.getValue() >= 2
          || value != val * 2 && map.containsKey(value - val)) return true;
    }
    return false;
  }
}

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */
/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */

/**
 * Your TwoSum object will be instantiated and called as such:
 * TwoSum obj = new TwoSum();
 * obj.add(number);
 * boolean param_2 = obj.find(value);
 */

