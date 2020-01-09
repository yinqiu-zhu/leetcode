package old.ch4_HashTable.FirstUniqueCharacterInAString_10;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public int firstUniqChar(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i ++){
      char temp = s.charAt(i);
      if (map.containsKey(temp)){
        map.put(temp, -1);
      }
      else map.put(temp,i);
    }
    int res = Integer.MAX_VALUE;
    for (Map.Entry<Character, Integer> entry:  map.entrySet()){
      int one = entry.getValue();
      if (one != -1 && one < res) res = one;
    }
    return res == Integer.MAX_VALUE? -1 : res;
  }
}