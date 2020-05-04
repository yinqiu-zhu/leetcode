package first2last.N0.N033;

class Solution {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;
        int start = 0, end = nums.length - 1, mid = end / 2;
        boolean maxLeftMid, targetLessMid;
        while (start < end){

            if (nums[mid] == target) return mid;

            maxLeftMid = nums[start] > nums[mid];
            targetLessMid = target < nums[mid];
            if (targetLessMid && maxLeftMid )
                end = mid - 1;
            if (targetLessMid && !maxLeftMid){
                if (nums[start] <= target) end = mid - 1;
                else start = mid + 1;
             }
            if (!targetLessMid && maxLeftMid){
                if (nums[end] >= target) start = mid + 1;
                else end = mid - 1;
            }
            if (!targetLessMid && !maxLeftMid)
                start = mid + 1;

            mid = start + (end - start) /2;
            }
        if (nums[start] == target) return start;
        else return -1;
        }

    public static void main(String[] args) {
        int[] b = {4,5,6,7,0,1,2};
        Solution one = new Solution();
        System.out.println(one.search(b,0));
    }
}