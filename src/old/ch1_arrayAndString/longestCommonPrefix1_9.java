package old.ch1_arrayAndString;

public class longestCommonPrefix1_9 {

  public String solution(String[] strs) {

    int size = strs.length;
    if (strs == null || strs.length == 0) return "";
    int shortest = strs[0].length();
    StringBuilder result = new StringBuilder();
    boolean end = false;
    char a;


    for (int i = 0; i< size; i++)
      if (strs[i].length() < shortest) shortest = strs[i].length();

    for (int j = 0; j < shortest; j++){
      a = strs[0].charAt(j);
       for (int i = 1; i< size; i++) {
         if (strs[i].charAt(j) != a) {
           end = true;
           break;
         }
       }
       if (end) break;
       result.append(a);
    }

    return result.toString();
  }



  public static void main(String... args) {

    {
      String[] a ={};
      longestCommonPrefix1_9 n = new longestCommonPrefix1_9();
      System.out.println(n.solution(a));
    }
  }

}
