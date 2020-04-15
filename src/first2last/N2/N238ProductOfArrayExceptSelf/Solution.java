package first2last.N2.N238ProductOfArrayExceptSelf;

class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        ans[0] = 1;
        for ( int i = 1; i < nums.length; i ++ ){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int count = 1;
        for (int i = nums.length - 2; i >= 0; i--){
            count *= nums[i+1];
            ans[i] *= count;
        }
        return ans;
    }
}