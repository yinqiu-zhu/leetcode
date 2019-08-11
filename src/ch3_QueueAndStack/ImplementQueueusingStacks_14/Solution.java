package ch3_QueueAndStack.ImplementQueueusingStacks_14;

public class Solution {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();
    queue.push(1);
    queue.push(2);
    queue.push(3);
    System.out.println(queue.pop());
    System.out.println(queue.pop());
    queue.push(4);
    System.out.println(queue.pop());
    System.out.println(queue.pop());
  }

}
