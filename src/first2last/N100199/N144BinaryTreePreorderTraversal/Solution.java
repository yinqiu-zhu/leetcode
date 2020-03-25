package first2last.N100199.N144BinaryTreePreorderTraversal;

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
