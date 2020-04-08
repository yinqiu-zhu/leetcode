package first2last.N5.N561;

public class Solution {

  public int arrayPairSum(int[] nums) {

    if (nums == null || nums.length == 0) return 0;

    int res = 0;

    sort(nums);

    for (int i = 0; i < nums.length; i += 2) {
      res += nums[i];
    }

    return res;
  }

  public int[] sort(int[] arr) {

    // a method for Mergesort;

    for (int i = 2; i < arr.length; i*=2){

    }
    return arr;
  }


  public static void main(String... args) {

    {
      int[] a = {};
      Solution n = new Solution();
      System.out.println(n.arrayPairSum(a));
    }
  }
}
