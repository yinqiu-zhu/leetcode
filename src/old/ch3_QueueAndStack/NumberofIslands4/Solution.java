package old.ch3_QueueAndStack.NumberofIslands4;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public int numIslands(char[][] grid) {

    if (grid == null) return 0;
    int row = grid.length;
    if (row == 0) return 0;
    int line = grid[0].length;
    if (line == 0) return 0;

    int count = 0;

    for (int r = 0; r < row; r ++){
      for (int l = 0; l < line; l++){
        if (grid[r][l] == '1') {
          bfs(grid, r, l);
          count++;
        }
      }
    }
    return count;
  }

  public void bfs(char[][] grid, int r, int l){

    int[][] move = new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
    int[] bound = new int[]{grid.length, grid[0].length};
    Queue<int[]> queue = new LinkedList<>();
    queue.offer(new  int[]{r,l});
    grid[r][l] = '0';

    while (!queue.isEmpty()){
      int size = queue.size();

      for (int i = 0; i < size; i ++){
        int[] one = queue.poll();
        for (int j = 0; j < 4; j ++){
          int x = one[0] + move[j][0];
          int y = one[1] + move[j][1];
          if ( x < bound[0] &&  y< bound[1]
              && x >= 0 && y >= 0){
            if (grid[x][y] == '1'){
              queue.offer(new int[]{x,y});
              grid[x][y] = '0';
            }
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    char[][] test = new char[][]
        {   {'1','0','0'},
            {'1','1','0'},
            {'0','0','1'}
        };
    int res = 0;
    Solution one = new Solution();
    res = one.numIslands(test);
  }
}
