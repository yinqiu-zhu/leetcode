package first2last.N4.N485;

public class Solution {

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
      Solution n = new Solution();
      System.out.println(n.findMaxConsecutiveOnes(a));
    }
  }

}
