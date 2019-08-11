package ch3_QueueAndStack.WallsAndGates3;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public void wallsAndGates(int[][] rooms) {

    Queue<Integer> todo = new LinkedList<>();

    int row = rooms.length;
    if (row == 0) return;
    int line = rooms[0].length;
    if (line == 0) return;

    for (int i = 0; i < row; i++){
      for (int j = 0; j < line; j++){
        if (rooms[i][j] == 0) {
          todo.offer(i);
          todo.offer(j);
        }
      }
    }

    int size = todo.size();
    if (size==0) return;

    int step = 0;

    while ( size != 0){

      step++;
      for (int i = 0; i < size; i+=2 ){
        int x = todo.poll();
        int y = todo.poll();

        if (x - 1 >= 0)
        if (rooms[x-1][y] == Integer.MAX_VALUE){
          todo.offer(x-1);
          todo.offer(y);
          rooms[x-1][y] = step;
        }

        if (y -1 >= 0)
        if (rooms[x][y-1] == Integer.MAX_VALUE){
          todo.offer(x);
          todo.offer(y-1);
          rooms[x][y-1] = step;
        }

        if (x+1 < row)
        if (rooms[x+1][y] == Integer.MAX_VALUE){
          todo.offer(x+1);
          todo.offer(y);
          rooms[x+1][y] = step;
        }

        if (y + 1< line)
        if (rooms[x][y+1] == Integer.MAX_VALUE){
          todo.offer(x);
          todo.offer(y+1);
          rooms[x][y+1] = step;
        }
      }

      size = todo.size();
    }
  }

  public static void main(String[] args) {
    Solution res = new Solution();
    int[][] rooms = {{2147483647,-1,0,2147483647},{2147483647,2147483647,2147483647,-1},{2147483647,-1,2147483647,-1},{0,-1,2147483647,2147483647}};
     res.wallsAndGates(rooms);
  }
}
