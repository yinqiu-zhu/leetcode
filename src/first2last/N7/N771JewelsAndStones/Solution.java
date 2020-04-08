package first2last.N7.N771JewelsAndStones;

import java.util.HashSet;
import java.util.Set;

class Solution {
  public int numJewelsInStones(String J, String S) {

    if (J == null || J == "" || S == null || S == "") return 0;
    Set<Character> jewels = new HashSet<>();
    int count = 0;

    for (int i=0;i<J.length();i++){
      jewels.add(J.charAt(i));
    }

    for (int i=0;i<S.length();i++){
      if (jewels.contains(S.charAt(i))) count ++;
    }

    return count;
  }
}