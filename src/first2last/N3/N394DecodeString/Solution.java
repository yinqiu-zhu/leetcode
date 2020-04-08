package first2last.N3.N394DecodeString;

import java.util.Stack;

class Solution {
  public String decodeString(String s) {

    Stack<String> substrStack = new Stack<>();
    Stack<Integer> repetedTimes = new Stack<>();
    StringBuilder substr = new StringBuilder();
    int repet = 0;

    for (char ch : s.toCharArray()){
      if (ch >= 30 && ch <= 57){
        if (substr.length() != 0){
          substrStack.push(substr.toString());
          substr = new StringBuilder();
        }
        repet = repet *10 + (ch - 48);
      }
      else if (ch == '['){
        repetedTimes.push(repet);
        repet = 0;
        substrStack.push("#");
      }
      else if (ch == ']'){
        int times = repetedTimes.empty()? 1 : repetedTimes.pop();
        if (substr.length() != 0){
          substrStack.push(substr.toString());
          substr = new StringBuilder();
        }
          String temp = "";
          while (substrStack.peek() != "#")
            temp = substrStack.pop().concat(temp);
        while (times != 0){
          substr.append(temp);
          times --;
        }
        substrStack.pop();
        substrStack.push(substr.toString());
        substr = new StringBuilder();

      }
      else {
        substr.append(ch);
      }
    }

    if (substrStack.empty()) return s;
    String temp = substr.toString();
    while (!substrStack.empty()){
      temp = substrStack.pop().concat(temp);
    }
    return temp;
  }

  public static void main(String[] args) {
    Solution one = new Solution();
    String test = "2[abc]3[cd]ef";
    System.out.println(one.decodeString(test));
  }
}