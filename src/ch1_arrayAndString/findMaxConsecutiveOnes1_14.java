package ch1_arrayAndString;

public class findMaxConsecutiveOnes1_14 {

  public int findMaxConsecutiveOnes(int[] nums) {

    int max = 0;

    for (int i = 0; i < nums.length; ){

      int res = 0;

      while( nums[i] == 1 && i < nums.length ){
        res ++;
        i++;
      }

      max = max > res? max : res;

    }
    return max;
  }

  public static void main(String... args) {

    {
      int[] a = {0, 1, 0,1,0,1,1};
      findMaxConsecutiveOnes1_14 n = new findMaxConsecutiveOnes1_14();
      System.out.println(n.findMaxConsecutiveOnes(a));
    }
  }

}
