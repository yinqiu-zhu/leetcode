package first2last.N5.N543;

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

    public int diameterOfBinaryTree(TreeNode root) {

        if (root == null ) return 0;
        int[] temp = rec(root);
        return Math.max(temp[0],temp[1]);
    }

    private int[] rec(TreeNode root){
        //int[0] is the joint value, and int[1] is the non-joint value.
        if (root.left == null && root.right == null)
            return new int[] {0,0};

        if (root.left == null){
            int[] right = rec(root.right);
            return new int[] {right[0],right[1]+1};
        }
        if (root.right == null){
            int[] left = rec(root.left);
            return new int[] {left[0],left[1]+1};
        }

        int[] left = rec(root.left), right = rec(root.right);
        int joint = Math.max(left[0], right[0]), single = Math.max(left[1],right[1]);
        if (left[1] + right[1] + 2 > joint)
            return new int[] {left[1] + right[1] + 2, single + 1};
        return new int[] {joint, single + 1};
    }
}