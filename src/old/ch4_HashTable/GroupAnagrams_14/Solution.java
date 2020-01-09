package old.ch4_HashTable.GroupAnagrams_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {

    if (strs.length == 0) return new ArrayList<>();

    int[] word = new int[26];
    Map<String, List<String>> map = new HashMap<String, List<String>>();

    for (int i =0; i < strs.length; i++){

      for (int j = 0; j < 26; j++) word[j] = 0 ;
      for (char ch : strs[i].toCharArray()) word[ch - 'a'] ++;

      StringBuilder sb = new StringBuilder(" ");
      for (int w : word){
        sb.append('#');
        sb.append(w);
      }
      String key = sb.toString();

      if (!map.containsKey(key)) map.put(key,new ArrayList<String>());
      map.get(key).add(strs[i]);
    }
    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {
    String[] words = {"eat","tea","tan","ate","nat","bat"};
    Solution one = new Solution();
    one.groupAnagrams(words);
  }
}