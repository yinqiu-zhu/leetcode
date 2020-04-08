package first2last.N7.N724;

public class Solution {

  public String addBinary1_7(String a, String b) {

    int carry = 0, sum;

    String bigger, smaller;

    if (a.length() >= b.length()) {
      bigger = a;
      smaller = b;
    } else {
      bigger = b;
      smaller = a;
    }

    int biggerL = bigger.length(), smallerL = smaller.length(), diff = biggerL - smallerL;

    StringBuilder res = new StringBuilder();

    for (int i = biggerL - 1; i >= 0; i--) {

      sum = i - diff >= 0 ? smaller.charAt(i - diff) - 48 : 0;

      switch (bigger.charAt(i) - 48 + sum + carry) {
      case 0:
        sum = 0;
        carry = 0;
        break;

      case 1:
        sum = 1;
        carry = 0;
        break;
      case 2:
        sum = 0;
        carry = 1;
        break;
      case 3:
        sum = 1;
        carry = 1;
        break;
      }
      res.insert(0, sum);
    }

    if (carry == 1)
      res.insert(0, 1);

    String result = res.toString();

    return result;

  }

  public static void main(String... args) {

    {
      String a = "1010", b = "1011";
      Solution n = new Solution();
      System.out.println(n.addBinary1_7(a, b)); // 10101
    }
    {
      String a = "111", b = "1111";
      Solution n = new Solution();
      System.out.println(n.addBinary1_7(a, b));
    }
    {
      String a = "1", b = "1";
      Solution n = new Solution();
      System.out.println(n.addBinary1_7(a, b));
    }
  }
}
