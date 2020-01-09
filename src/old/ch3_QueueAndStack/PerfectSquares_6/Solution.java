package old.ch3_QueueAndStack.PerfectSquares_6;

import java.util.*;

public class Solution {

  public int numSquares(int n) {


    Queue<Integer> queue = new LinkedList<>();
    Set<Integer> set = new HashSet<>();
    queue.offer(-1);
    queue.offer(0);
    set.add(0);
    int step = 0;


    while (true){

      while (queue.peek() != -1) {
        int temp = queue.poll();
        for (int i = 1; i * i <= n - temp; i++) {
          int one = temp + i * i;
          if (one == n) return step;
          else if (!set.contains(one)){
            set.add(one);
            queue.offer(one);
          }
          }
      }

      queue.offer(queue.poll());
      step ++;
    }
  }

  public static void main(String[] args) {
    Solution one = new Solution();
    System.out.println(one.numSquares(12));
  }
}
