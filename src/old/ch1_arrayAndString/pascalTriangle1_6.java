package old.ch1_arrayAndString;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle1_6 {

  public List<List<Integer>> generate(int numRows) {

    List<List<Integer>> result = new ArrayList<List<Integer>>();
    ArrayList<Integer> row = new ArrayList<Integer>();


    for( int i = 0; i < numRows; i ++){

      row.add(0,1);

      for (int j = 1; j < i; j ++){
        row.set( j , row.get(j)+row.get(j+1));
      }

      result.add(new ArrayList<>(row));

    }

    return result;

  }

  public pascalTriangle1_6() {
    int b = 0;
  }


  public static void main(String... args) {

    int a = 5;
    pascalTriangle1_6 n = new pascalTriangle1_6();
    System.out.println(n.generate(a));
  }
}