package first2last.N1.N151;

public class Solution {
  public String reverseWords(String s) {

    if (s == null || s.length() == 0) return s;
    if (s.length() == 1 && s.charAt(0) == ' ') return "";

    StringBuilder res = new StringBuilder();
    boolean trigger = false;
    int end = 0;

    for (int i = s.length()-1; i >= 0 ;i-- ) {

      if (trigger == false) {
        if (s.charAt(i) != ' ') {
          end = i;
          trigger = true;
        }
      }

      else {
        if (s.charAt(i) == ' ') {
          trigger = false;
          if (res.length() != 0) res.append(' ');
          res.append( s.substring(i+1,end+1) );
        }
      }

      if (i == 0 && trigger == true){
        if (res.length() != 0) res.append(' ');
        res.append( s.substring(i,end+1) );
      }
    }

    return res.toString();

  }


  public static void main(String... args) {

    String b = "  hello   world ";
    Solution n = new Solution();
    n.reverseWords(b);
  }
}
