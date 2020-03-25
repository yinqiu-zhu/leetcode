package first2last.N001099.N066;

public class Solution {
  public int[] solution(int[] digits) {
    int size = digits.length, position = size;
    for (int i = size - 1; i >= 0; i--){
      if (digits[i] == 9 && position == i + 1){
        position = i;
        digits[i] = 0;
      }
    }
    if (position != 0){
      digits[position - 1] = digits[position - 1] +1;
    }
    else {
      digits =  new int[size+1];
      digits[0] = 1;
      for(int i = 1; i < size; i++){
        digits[i] = 0;
      }
    }
    return digits;
  }



  public Solution() {
    int b = 0;
  }


  public static void main(String... args) {

    int[] a = {9,1,9,9,9,9};
    Solution n = new Solution();
    System.out.println(n.solution(a));

  }

}
