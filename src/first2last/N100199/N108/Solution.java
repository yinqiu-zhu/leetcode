package first2last.N100199.N108;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {

    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        this.nums = nums;
        return constrTree( 0, nums.length-1);
    }

    private TreeNode constrTree( int left, int right){
        if (left > right) return null;
        int mid = left + (right - left) / 2;
        TreeNode one = new TreeNode(nums[mid]);
        one.left = constrTree( left, mid - 1);
        one.right = constrTree(mid + 1, right);
        return one;
    }

    public static void main(String[] args) {
        int[] one = {-10,-3,0,5,9,10,11};
        Solution temp = new Solution();
        temp.sortedArrayToBST(one);
    }
}
