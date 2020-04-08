package first2last.N7.N747;

public class Solution {
  public int solution1(int[] nums) {

    if (nums == null) {
      return -1;
    } else if (nums.length == 1) {
      return 0;
    }

    int max = Integer.MIN_VALUE, index = 0, second = Integer.MIN_VALUE;

    for (int i = 0; i <= nums.length - 1; i++) {
      if (nums[i] > max) {
        second = max;
        max = nums[i] ;
        index = i;
      }
    }

    if (max >= second + second) {
      return index;
    }

    return -1;
  }

  public int solution2(int[] nums) {
    // an elegant solution varied from leetcode's discussion

    int result = 0, target = Integer.MIN_VALUE;
    boolean flag = false;

    for (int i = 0; i < nums.length; i++){
      if (nums[i] >= target*2){
        flag = true;
        result = i;
        target = nums[i];
      }
      else if (nums[i]*2 > target){
        flag = false;
        if (nums[i]>target){
          target = nums[i];
        }
      }
    }

    return flag? result : -1;
  }

  public Solution() {
    int b = 0;
  }


  public static void main(String... args) {

    int[] a = {0,0,4,3};
    Solution n = new Solution();
    System.out.println(n.solution2(a));

  }

}
