package ch1_arrayAndString;

public class strStr1_8 {

  public int solution0(String haystack, String needle) {

    if (needle.length() == 0) return 0;

    return haystack.indexOf(needle);
  }

  public int solution1(String haystack, String needle) {

    int size = needle.length(), range  = haystack.length();

    if (size == 0) {
      return 0;
    }

    for (int i = 0; i + size -1 < range; i ++){

     if (haystack.charAt(i) == needle.charAt(0)){
       for (int k = 0; k < size ; k ++){
         if (haystack.charAt(k+i) != needle.charAt(k)) break;
         else if (k == size-1) return i;
       }
     }
    }

    return -1;
  }



  public static void main(String... args) {

    {
      String a = "101011", b = "10";
      strStr1_8 n = new strStr1_8();
      System.out.println(n.solution1(a, b));
    }
  }

}
