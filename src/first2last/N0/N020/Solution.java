package first2last.N0.N020;

import java.util.Stack;

public class Solution {
  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray() ){
      if (ch == '(' || ch == '{' || ch == '[')
        stack.push(ch);
      else {
        if (stack.empty()) return false;
        char one = stack.pop();
        if (one != (char) (ch-1) && one != (char) (ch-2)) return false;
      }
    }

    if (stack.empty()) return true;
    else return false;
  }

  public static void main(String[] args) {
    Solution one = new Solution();
    String test = "()";
    System.out.println(one.isValid(test));
  }
}
