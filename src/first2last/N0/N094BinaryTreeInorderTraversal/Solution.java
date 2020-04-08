package first2last.N0.N094BinaryTreeInorderTraversal;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Definition for a binary tree node.
 * public class ch5_BinaryTree.TreeNode {
 *     int val;
 *     ch5_BinaryTree.TreeNode left;
 *     ch5_BinaryTree.TreeNode right;
 *     ch5_BinaryTree.TreeNode(int x) { val = x; }
 * }
 */
class Solution {

  List<Integer> res = new ArrayList<>();
  Set<TreeNode> visited = new HashSet<>();

  public List<Integer> inorderTraversal(TreeNode root) {

    dfs(root);

    return res;
  }

  public void dfs( TreeNode root ) {

    if (root == null) return;
    dfs(root.left);
    if (root.left == null || visited.contains(root.left)){
      visited.add(root);
      res.add(root.val);
      dfs(root.right);
    }
  }

  public static void main(String[] args) {
    TreeNode a1 = new TreeNode(1);
    TreeNode a2 = new TreeNode(2);
    TreeNode a3 = new TreeNode(3);
    a1.right = a2;
    a2.left = a3;

    Solution one = new Solution();
    List res = one.inorderTraversal(a1);
    for(int i=0;i<res.size();i++){
      System.out.println(res.get(i));
    }
  }
}