package first2last.N2.N222;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        int leftLevel = countL(root.left);
        int rightLevel = countR(root.right);

        if (leftLevel == rightLevel)
            return (2 << (leftLevel -1 )) - 1;
        else
            return  countNodes(root.left) + 1 + countNodes(root.right);
    }

    private int countL(TreeNode root){
        int level = 0;
        while (root != null){
            level ++;
            root = root.left;
        }
        return level;
    }

    private int countR(TreeNode root){
        int level = 0;
        while (root != null){
            level ++;
            root = root.right;
        }
        return level;
    }
}
