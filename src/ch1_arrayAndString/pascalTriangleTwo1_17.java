package ch1_arrayAndString;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangleTwo1_17 {

  public List<Integer> getRow(int rowIndex) {

    List<Integer>  res =  new ArrayList<>();
    if (rowIndex < 0) return res;

    for (int i = 0; i <= rowIndex ; i ++){

      res.add(i,1);

    }

    for (int i = 0; i < rowIndex+1 ; i ++){

      for (int j = rowIndex - i + 1; j < rowIndex; j ++){
        res.set(j, res.get(j)+res.get(j-1));
      }


    }

    return res;
  }

  public static void main(String... args) {

    int b = 9;
    pascalTriangleTwo1_17 n = new pascalTriangleTwo1_17();
    n.getRow(b);
  }

}
