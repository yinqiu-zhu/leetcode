package old.ch3_QueueAndStack.ImplementStackUsingQueues_15;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {

  /** Initialize your data structure here. */

  Queue<Integer> res;

  public MyStack() {
    res = new LinkedList<>();
  }

  /** Push element x onto stack. */
  public void push(int x) {

    res.offer(x);
    for (int i = 0; i < res.size()-1; i++){
      res.offer(res.poll());
    }

  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    return res.poll();
  }

  /** Get the top element. */
  public int top() {
    return res.peek();
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return res.isEmpty();
  }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
