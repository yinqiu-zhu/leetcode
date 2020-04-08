package first2last.N4.N498;

public class Solution {
  public int[] solution(int[][] matrix) {
    if (matrix.length == 0) return new int[0];
    int  n = matrix.length, m = matrix[0].length, x = 0, y = 0, result[] = new int[n * m];
    boolean trigger = true;
    // (x,y) is the coordinate

    for (int i = 0; i < n * m; i++) {

      result[i] = matrix[x][y];

      if (trigger) {
        if (y == m - 1) {
          trigger = !trigger;
          x++;
        } else if (x == 0) {
          trigger = !trigger;
          y++;
        } else {
          x--;
          y++;
        }
      } else {
        if (x == n - 1) {
          trigger = !trigger;
          y++;
        } else if (y == 0) {
          trigger = !trigger;
          x++;
        } else {
          x++;
          y--;
        }
      }
    }

    return result;
  }

  public Solution() {
    int b = 0;
  }


  public static void main(String... args) {

    int[][] a = {{1, 2}, {3, 4}};
    Solution n = new Solution();
    System.out.println(n.solution(a));
  }
}
