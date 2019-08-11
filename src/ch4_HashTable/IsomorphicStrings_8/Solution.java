package ch4_HashTable.IsomorphicStrings_8;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public boolean isIsomorphic(String s, String t) {

    Map<Character, Integer> smap = new HashMap<>();
    Map<Character, Integer> tmap = new HashMap<>();

    char[] sa = s.toCharArray();
    char[] ta = t.toCharArray();

    for (int j = 0; j < s.length(); j++){

      char sc = sa[j], tc = ta[j];

      if (smap.containsKey(sc)) {
        if ( smap.get(sc) != tmap.get(tc)) return false;
      }
      else if (tmap.containsKey(tc)) return false;
           else{
             smap.put(sc,j);
             tmap.put(tc,j);
      }
    }
    return true;
  }
}