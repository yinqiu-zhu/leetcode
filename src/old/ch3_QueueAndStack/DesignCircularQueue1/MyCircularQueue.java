package old.ch3_QueueAndStack.DesignCircularQueue1;

public class MyCircularQueue {

  int head, tail, size, number = 0;
  int[] queue;

  /**
   * Initialize your data structure here. Set the size of the queue to be k.
   */

  public MyCircularQueue(int k) {
    size = k;
    head = -1;
    tail = -1;

    queue = new int[k];
  }

  /**
   * Insert an element into the circular queue. Return true if the operation is successful.
   */
  public boolean enQueue(int value) {

    if (this.isFull()) return false;

    if (head == -1 && tail == -1) {
      head = 0;
      tail = 0;
    }
    else if (tail == size - 1) tail = 0;
    else tail++;

    queue[tail] = value;
    number++;
    return true;

  }

  /**
   * Delete an element from the circular queue. Return true if the operation is successful.
   */
  public boolean deQueue() {

    if (isEmpty()) return false;
    if (head == size - 1) head = 0;
    else head ++;
    number--;
    return true;
  }

  /**
   * Get the front item from the queue.
   */
  public int Front() {

    if (isEmpty() == true) return -1;
    if (head < 0 ) return -1;
    else return queue[head];

  }

  /**
   * Get the last item from the queue.
   */
  public int Rear() {

    if (isEmpty() == true) return -1;
    else
      return queue[tail];

  }

  /**
   * Checks whether the circular queue is empty or not.
   */
  public boolean isEmpty() {

    return number == 0;

  }

  /**
   * Checks whether the circular queue is full or not.
   */
  public boolean isFull() {

    return number == size;

  }

  /**
   * Your MyCircularQueue object will be instantiated and called as such:
   * MyCircularQueue obj = new MyCircularQueue(k);
   * boolean param_1 = obj.enQueue(value);
   * boolean param_2 = obj.deQueue();
   * int param_3 = obj.Front();
   * int param_4 = obj.Rear();
   * boolean param_5 = obj.isEmpty();
   * boolean param_6 = obj.isFull();
   */

  public static void main(String[] args) {
//    {
//      MyCircularQueue queue = new MyCircularQueue(3);
//      queue.enQueue(2);
//      queue.Rear();
//      queue.Front();
//      queue.deQueue();
//      queue.Front();
//      queue.deQueue();
//      queue.Front();
//      queue.enQueue(4);
//      queue.enQueue(2);
//      queue.enQueue(2);
//      queue.enQueue(3);
//    }
    {
      MyCircularQueue queue = new MyCircularQueue(3);
      queue.enQueue(2);
      queue.enQueue(2);
      queue.deQueue();
      System.out.println(queue.Front());
    }
  }
}