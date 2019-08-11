package ch3_QueueAndStack.EvaluateReversePolishNotation_10;

import java.util.Stack;


class Solution {
  public int evalRPN(String[] tokens) {

    if (tokens == null || tokens.length == 0) return 0;

    Stack<Integer> stack = new Stack<>();

    int res = Integer.MAX_VALUE;
    for (String str : tokens){
      switch (str) {
        case "+":
          if (res == Integer.MAX_VALUE)
            res = stack.pop();
          res += stack.pop();
          break;
        case "-":
          if (res == Integer.MAX_VALUE){
            int a = stack.pop();
            int b = stack.pop();
            res = b - a;
          }
          else res -= stack.pop();
          break;
        case "*":
          if (res == Integer.MAX_VALUE)
            res = stack.pop();
          res *= stack.pop();
          break;
        case "/":
          if (res == Integer.MAX_VALUE){
            int a = stack.pop();
            int b = stack.pop();
            res = b / a;
          }
          else res /= stack.pop();
          break;
        default:
          stack.push(Integer.parseInt(str));
      }
    }

    return res;
  }
}
