package first2last.N10.N1008;

import java.util.Stack;

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
    public TreeNode bstFromPreorder(int[] preorder) {

        if (preorder == null || preorder.length == 0)
            return null;
        TreeNode head = new TreeNode(preorder[0]), root = head;
        Stack<TreeNode> stack = new Stack<>();
        for (int i = 1; i < preorder.length; i++){
            int curVal = preorder[i];
            TreeNode temp = new TreeNode(curVal);
            if ( curVal<= head.val){
                stack.push(head);
                head.left = temp;
                head = temp;
            }
            else{
                 while (!stack.empty() && stack.peek().val < curVal){
                     head = stack.pop();
                 }
                 head.right = temp;
                 head = temp;
            }
        }
        return root;
    }
}