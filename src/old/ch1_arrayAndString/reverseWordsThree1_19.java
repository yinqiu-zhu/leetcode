package old.ch1_arrayAndString;

public class reverseWordsThree1_19 {
  public String reverseWords(String s) {

    if (s == null || s.length() == 0) return s;

    StringBuilder res = new StringBuilder();
    boolean trigger = false;
    int begin = 0;

    for (int i = 0; i < s.length() ;i++ ) {

      if (trigger == false) {
        if (s.charAt(i) != ' ') {
          begin = i;
          trigger = true;
        }
      } else {
        if (s.charAt(i) == ' ') {
          trigger = false;
          if (res.length() != 0) res.append(' ');
          res.append(revers( s.substring(begin, i) ) );
        }
      }
      if ( i == s.length() - 1 && trigger == true){
        if (res.length() != 0) res.append(' ');
        res.append(revers( s.substring(begin, i+1) ) );
      }
    }
    return res.toString();
  }

  public String revers(String str){
    StringBuilder res = new StringBuilder();

    for (int i = str.length()-1; i >= 0; i --){
      res.append(str.charAt(i));
    }
    return res.toString();
  }

  public static void main(String... args) {

    String b = "hello world";
    reverseWordsThree1_19 n = new reverseWordsThree1_19();
    n.reverseWords(b);
  }
}
