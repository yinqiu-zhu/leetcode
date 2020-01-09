package old.ch1_arrayAndString;

import java.util.ArrayList;
import java.util.List;

public class spiralOrder1_5 {
  public List<Integer> spiralOrder(int[][] matrix)  {
    List<Integer> result = new ArrayList<Integer>();
    if (matrix.length == 0 || matrix[0].length == 0) return result;
    int n = matrix.length, m = matrix[0].length, x = 0, y = 0, direction = 0,rounds=0;
    // (x,y) is the coordinate; direction = 0 means going to the right, and direction + 1 means turing right.

    for (int i = 0; i < n * m; i++) {

       result.add(matrix[x][y]);

      switch (direction){

        case 0: if (y == m-1 - rounds) {
          direction ++;
          x++;
        }
        else y++;
        break;

        case 1: if ( x == n-1 - rounds ){
          direction ++;
          y--;
        }
        else x++;
        break;

        case 2: if (y == rounds ){
          direction ++;
          x--;
          rounds ++;
        }
        else y--;
        break;

        case 3: if (x == rounds){
          direction = 0;
          y++;
        }
        else x--;
        break;
      }
    }
    return result;
  }

  public spiralOrder1_5() {
    int b = 0;
  }


  public static void main(String... args) {

    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    spiralOrder1_5 n = new spiralOrder1_5();
    System.out.println(n.spiralOrder(a));
  }
}
