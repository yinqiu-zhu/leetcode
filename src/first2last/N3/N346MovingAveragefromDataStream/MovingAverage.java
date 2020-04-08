package first2last.N3.N346MovingAveragefromDataStream;


class MovingAverage {

  /** Initialize your data structure here. */
  class ListNode{
    int val;
    ListNode next;

    public ListNode(int _val){
      val = _val;
      next = null;
    }
  }
  ListNode head;
  int size, length = 0;

  public MovingAverage(int _size) {

    if (_size == 0) {
      return;
    }

    ListNode temp= new ListNode(0);
    head = temp;
    size = _size;
    for (int i = 1; i < _size; i++ ){
      ListNode one = new ListNode(0);
      head.next = one;
      head = head.next;
    }
    head.next = temp;
  }

  public double next(int val) {

    if (size == 0) return 0;

    head.val = val;
    length = length < size? length +1 : length;
    double sum = 0;

    for (int i = 0; i < size; i ++){
      sum = sum + head.val;
      head = head.next;
    }
    head = head.next;

    sum = sum / length;

    return sum;
  }

  public static void main(String[] args) {
    MovingAverage one = new MovingAverage(3);
    one.next(1);
    one.next(10);
    one.next(3);
    one.next(5);
  }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
