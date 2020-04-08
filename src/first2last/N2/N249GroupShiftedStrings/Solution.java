package first2last.N2.N249GroupShiftedStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
  public List<List<String>> groupStrings(String[] strings) {

    int shifting = 0, count = 0;
    Map<String, List<String>> map = new HashMap<String, List<String>>();

    for (String str : strings){

      count = str.length();
      char[] word = str.toCharArray();
      StringBuilder sb = new StringBuilder(" ");
      char temp = word[0];

      for (char ch : word){
        sb.append('#');
        if (ch - temp < 0) temp = (char) (ch - temp + 26);
        else temp =(char) (ch - temp);
        sb.append(temp);
        temp = ch;
      }

      String key = sb.toString();
      if ( ! map.containsKey(key)) map.put(key, new ArrayList());
      map.get(key).add(str);
    }

    return new ArrayList<>(map.values());
  }
}