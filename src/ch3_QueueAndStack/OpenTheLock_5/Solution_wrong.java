package ch3_QueueAndStack.OpenTheLock_5;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_wrong {
  public int openLock(String[] deadends, String target) {

    // initialize
    Queue<String> queue = new LinkedList<>();
    if (target == "0000") return 0;

    target.toCharArray();

    queue.offer("0000");

    int step = 0,size = 0;
    int checkLength = deadends.length;
    boolean check;
    String one;

    while (!queue.isEmpty()) {

      step ++;
      size = queue.size();

      for (int j = 0; j < size; j++) {

        String temp = queue.poll();

        for (int i = 0; i < 8; i++) {
          one = move(temp, i);
          if (!hasDeadends(deadends, one)){
            if (one == target) return step;
            else queue.offer(one);
          }
        }
      }
    }
    return -1;
  }

  public String move(String str, int i){
    int[] one = new int[4];

    for (int j = 0; j < 4; j++){
      if (j != i / 2 ) one[j] = str.indexOf(j)+1;
      else {
        if (i % 2 == 0)
          if (str.indexOf(j)+1 == 0) one[j] = 9;
          else one[j] = str.indexOf(j);
        else if (str.indexOf(j)+1 == 9) one[j] = 0;
           else one[j] = str.indexOf(j) + 2;
      }
    }

    return one.toString();
  }

  public boolean hasDeadends(String[] deadends, String step) {
    int size = deadends.length;
    for (int k = 0; k < size; k++) {
      if (deadends[k] == step) return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Solution_wrong one = new Solution_wrong();
    String target = "0202";
    String[] deadends = {"0201","0101","0102","1212","2002"};
    int res = one.openLock(deadends, target);
  }
}

