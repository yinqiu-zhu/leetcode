package ch10_Recursion1.ReverseString_1;

public class Solution {
  public void reverseString(char[] s) {
    helper(s, 0, s.length-1);
  }

  private void helper(char[] s, int head, int tail) {
    if ( s == null  || head >= tail){
      return;
    }
    char x = s[head];
    s[head] = s [tail];
    s[tail] = x;
    helper(s, head+1, tail-1);
  }
}
