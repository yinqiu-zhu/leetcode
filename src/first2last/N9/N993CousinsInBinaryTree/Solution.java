package first2last.N9.N993CousinsInBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public boolean isCousins(TreeNode root, int x, int y) {

        if (root.val == x || root.val == y) return false;
        boolean IsX = false, IsY = false;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++){
                boolean diff = IsX != IsY;
                TreeNode cur = queue.poll();
                if (cur.right != null){
                    IsX = cur.right.val == x || IsX;
                    IsY = cur.right.val == y || IsY;
                    queue.offer(cur.right);
                }
                if (cur.left != null){
                    IsX = cur.left.val == x || IsX;
                    IsY = cur.left.val == y || IsY;
                    queue.offer(cur.left);
                }
                if (IsX && IsY)
                    return diff;
            }
            if ( IsX != IsY) return false;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode a4 = new TreeNode(4,null,null);
        TreeNode a5 = new TreeNode(5,null,null);
        TreeNode a3 = new TreeNode(3,null,a5);
        TreeNode a2 = new TreeNode(2,null,a4);
        TreeNode a1 = new TreeNode(1,a2,a3);
        System.out.println(solution.isCousins(a1,5,4));
    }
}
