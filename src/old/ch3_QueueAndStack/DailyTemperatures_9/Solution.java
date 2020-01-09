package old.ch3_QueueAndStack.DailyTemperatures_9;

import java.util.Stack;

class Solution {
  public int[] dailyTemperatures(int[] T) {

    Stack<Integer> stack = new Stack<>();
    if (T == null) return T;
    stack.push(0);

    for (int i = 1; i < T.length; i++){

      while (!stack.empty() && T[stack.peek()] < T[i]){
        int pos = stack.pop();
        T[pos] = i -  pos;
      }

      stack.push(i);
    }

    while (!stack.empty()){
      T[stack.pop()] = 0;
    }

    return T;
  }

  public static void main(String[] args) {
    Solution one = new Solution();
    int[] test = {73, 74, 75, 71, 69, 72, 76, 73};
    one.dailyTemperatures(test);
    for (int i : test)
      System.out.println(i);
  }
}
