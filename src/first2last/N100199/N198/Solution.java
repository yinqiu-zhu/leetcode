package first2last.N100199.N198;

class Solution {
    public int rob(int[] nums) {
        int[][] dp = new int[nums.length+1][2];
        for (int i = 1; i <= nums.length; i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]);
            dp[i][1] = nums[i-1] + dp[i-1][0];
        }
        return Math.max(dp[nums.length][0], dp[nums.length][1]);
    }

    public int rob2(int[] nums){
        if (nums == null || nums.length == 0)
            return 0;
        int prevNo = 0, prevYes = nums[0];
        for (int i = 1; i < nums.length; i++){
            int temp = prevNo;
            prevNo = Math.max(prevYes, prevNo);
            prevYes = temp + nums[i];
        }
        return Math.max(prevNo, prevYes);
    }
}
