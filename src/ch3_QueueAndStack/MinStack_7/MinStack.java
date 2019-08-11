package ch3_QueueAndStack.MinStack_7;

public class MinStack {

  /** initialize your data structure here. */
  private class Node{

    int val, min;
    Node next;

    public Node(int val, int min, Node next){
      this.val = val;
      this.next = next;
      this.min = min < val? min :val;
    }

  }

  Node stack;
  int size;
  public MinStack() {

    size = 0;
  }

  public void push(int x) {
    if (stack == null)
      stack = new Node(x, x, null);
    else
      stack = new Node(x, Math.min(stack.min, x), stack);
    size ++;
  }

  public Boolean isEmpty(Node stack){
    return size == 0;
  }

  public void pop() {
    if ( size != 0) {
      {stack = stack.next;
      size --;}
    }
  }

  public int top() {
    if (!isEmpty(stack)) return stack.val;
    else return Integer.MIN_VALUE;
  }

  public int getMin() {
    return stack.min;
  }

  public static void main(String[] args) {
    MinStack one = new MinStack();
    one.push(2);
    System.out.println(one.getMin());
    one.push(0);
    one.push(3);
    one.push(0);
    System.out.println(one.getMin());
    one.pop();
    System.out.println(one.getMin());
    one.pop();
    System.out.println(one.getMin());
    one.pop();
    System.out.println(one.getMin());
  }
}
