package old.ch3_QueueAndStack.ImplementQueueusingStacks_14;

import java.util.Stack;

class MyQueue {

  /** Initialize your data structure here. */
  Stack<Integer> temp,mid,res;

  public MyQueue() {
     res = new Stack();
     temp = new Stack<>();
     mid = new Stack<>();
  }

  public void load( ){

    if (temp.empty()) return;

    while (!temp.empty())
      mid.push(temp.pop());

    while (!res.empty())
      temp.push(res.pop());

    while (!temp.empty())
      mid.push(temp.pop());

    res = mid;
    mid = new Stack<>();

  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    temp.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    load();
    return res.pop();
  }

  /** Get the front element. */
  public int peek() {
    load();
    return res.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return res.empty()&& temp.empty();
  }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
