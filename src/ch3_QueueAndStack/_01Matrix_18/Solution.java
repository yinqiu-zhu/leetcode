package ch3_QueueAndStack._01Matrix_18;

import java.util.LinkedList;
import java.util.Queue;

class Solution {


  public int[][] updateMatrix(int[][] matrix) {

    //initialization: exceptional condition;
    if (matrix == null || matrix.length == 0) return matrix;
    int row = matrix.length, column = matrix[0].length;

    //to store the positions to be searched: the former number is row and latter is column;
    Queue<Integer> queue = new LinkedList<>();

    // initialization: change every number to be searched;
    for (int i = 0; i < row; i++){
      for (int j = 0; j < column; j++){
        if (matrix[i][j] == 1)
          matrix[i][j] = Integer.MAX_VALUE;
        else {
          queue.offer(i);
          queue.offer(j);
        }
      }
    }

    //body
    while (!queue.isEmpty()){

        int i = queue.poll(), j = queue.poll(),
            step = matrix[i][j]+1;
        if ( i+1 < row &&  step < matrix[i+1][j]){
          matrix[i+1][j] = step;
          queue.add(i+1);
          queue.add(j);
        }
        if ( j+1 < column &&  step < matrix[i][j+1]){
          matrix[i][j+1] = step;
          queue.add(i);
          queue.add(j+1);
        }
        if ( i-1 >= 0 &&  step < matrix[i-1][j]){
          matrix[i-1][j] = step;
          queue.add(i-1);
          queue.add(j);
        }
        if ( j-1 >= 0 &&  step < matrix[i][j-1]){
          matrix[i][j-1] = step;
          queue.add(i);
          queue.add(j-1);
        }

    }

    return matrix;
  }

  public static void main(String[] args) {
    int[][] test = {

    };
    Solution one = new Solution();
    int[][] res = one.updateMatrix(test);
    for (int[] i : res){
      for (int j : i){
        System.out.print(" " + j + ",");
      }
      System.out.println();
    }
  }
}