package N144BinaryTreePreorderTraversal;


import ch5_BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {

  List<Integer> list = new LinkedList<>();

  public List<Integer> preorderTraversal(TreeNode root) {

    dfs(root);
    return list;
  }

  public void  dfs(TreeNode root){
    if (root == null) return;
    list.add(root.val);
    dfs(root.left);
    dfs(root.right);
  }
}
