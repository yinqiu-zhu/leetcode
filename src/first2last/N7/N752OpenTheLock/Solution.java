package first2last.N7.N752OpenTheLock;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Solution {
  public int openLock(String[] deadends, String target) {

    Queue<String> queue = new LinkedList<>();
    Set<String> deadSet = new HashSet<>();
    Set<String> searchSet = new HashSet<>();

    for (String str : deadends)
      deadSet.add(str);

    if (target.equals("0000")) return 0;
    if (deadSet.contains("0000") || deadSet.contains(target)) return -1;

    queue.offer("0000");
    searchSet.add("0000");

    int step = 0,size = 0;
    String one;

    while (!queue.isEmpty()) {

      step ++;
      size = queue.size();

      for (int j = 0; j < size; j++) {

        String temp = queue.poll();

        for (int i = 0; i < 4; i++) {
          for (int k = -1; k < 2; k += 2){
            char ch = (char)(temp.charAt(i) + k);
            ch = ch > '9' ? '0' : ch;
            ch = ch < '0' ? '9' : ch;
            one = temp.substring(0,i) + (""+ch) + temp.substring(i+1);
            if (one.equals(target)) return step;
          if (!deadSet.contains(one) && !searchSet.contains(one)){
              queue.offer(one);
              searchSet.add(one);
            }
          }
          }
        }
      }
    return -1;
  }




  public static void main(String[] args) {

    String[] one =  {"0201","0101","0102","1212","2002"};
    Solution test = new Solution();
    System.out.println(test.openLock(one,"0202"));


  }
}
