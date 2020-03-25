package first2last.N001099.N053;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, res = nums[0];
        boolean trigger = true;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && trigger) {
                res = res < nums[i] ? nums[i] : res;
            } else {
                if (sum + nums[i] > 0) {
                    sum = sum + nums[i];
                    trigger = false;
                } else {
                    sum = 0;
                }
                if (sum > res) res = sum;
            }
        }
        return res;
        }
    }
