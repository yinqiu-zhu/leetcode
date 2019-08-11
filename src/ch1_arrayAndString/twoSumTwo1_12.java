package ch1_arrayAndString;

public class twoSumTwo1_12 {

  public int[] twoSum(int[] numbers, int target) {

    int left = 0, right = 1;
    boolean trigger = false;

    for (int diff = target - numbers[0] - numbers[1]; diff != 0; ) {

      if (trigger){
        while (numbers[left] + numbers[right] > target ) right --;
        trigger = false;
      }

      else if (diff < 0 || right == numbers.length - 1) {
        trigger = true;
        left ++;
      }

      else if ( diff > 0 ) right++;


      diff = target - numbers[left] - numbers[right];

    }
    int[] res = {left+1, right+1};
    return res;
  }

  public int[] twoSum2(int[] numbers, int target) {


    for (int i = 0; i < numbers.length; i++) {
      for (int j = i + 1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          int[] res = {i + 1, j + 1};
          return res;
        }
      }
    }

    return null;

  }


  public static void main(String... args) {

    {
      int[] a = {12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180, 199, 212, 221, 227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368, 370, 370, 371, 375, 384, 387, 394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583, 585, 587, 650, 652, 677, 691, 730, 737, 740, 751, 755, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863, 863, 874, 887, 896, 916, 920, 926, 927, 930, 933, 957, 981, 997};
      int b = 542;

      //int[] a = {5,25,75};
      //int b = 100;
      twoSumTwo1_12 n = new twoSumTwo1_12();
      System.out.println(n.twoSum(a, b));
    }
  }

}
