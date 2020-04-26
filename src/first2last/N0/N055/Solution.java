package first2last.N0.N055;

class Solution {
    public boolean canJump(int[] nums) {

        int aim = nums.length - 1;
        int pos = aim - 1;

        while (pos >= 0){
            if (pos + nums[pos] >= aim){
                aim = pos;
            }
            pos--;
        }
        return aim <= 0;
    }
}
