package ch1_arrayAndString;

public class minSubArrayLen1_15 {
  public int minSubArrayLen(int s, int[] nums) {

    int res = 0, begin = 0, end = 0, sum = 0;

    if (nums == null || nums.length == 0 || s == 0) return 0;

    for (; end < nums.length; end++) {

      sum += nums[end];

      if (sum >= s) {
        if (res == 0) res = end - begin + 1;
        while (sum - nums[begin] >= s) {
          sum -= nums[begin];
          begin++;
        }
        res = Math.min(res, end - begin + 1);
      }

    }
    return res;
  }

  public static void main(String... args) {

    int[] a = {1, 2, 3, 4, 5};
    int b = 11;
    minSubArrayLen1_15 n = new minSubArrayLen1_15();
    System.out.println(n.minSubArrayLen(b, a));
  }
}
