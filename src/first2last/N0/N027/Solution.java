package first2last.N0.N027;

public class Solution {
  public int removeElement(int[] nums, int val) {
    int len = nums.length;
    for (int i = 0 ; i< len; ++i){
      while (nums[i]==val && i< len) {
        nums[i]=nums[--len];
      }
    }
    return len;
  }

  public static void main(String... args) {

    {
      int[] a = {0, 1, 2, 2, 3, 0, 4, 2, 2};
      int b = 2;
      Solution n = new Solution();
      System.out.println(n.removeElement(a, b));
    }
  }
}
