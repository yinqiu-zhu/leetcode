package first2last.N100199.N145BinaryTreePostorderTraversal;

import java.util.LinkedList;
import java.util.List;

class Solution {

  List<Integer> list = new LinkedList<>();

  public List<Integer> postorderTraversal(TreeNode root) {
    dfs(root);
    return list;
  }

  public void dfs(TreeNode root){
    if (root == null) return;
    dfs(root.left);
    dfs(root.right);
    list.add(root.val);
  }

  public static void main(String[] args) {
    TreeNode a1 = new TreeNode(1),
        a2 = new TreeNode(2),
        a3 = new TreeNode(3),
        a4 = new TreeNode(4),
        a5 = new TreeNode(5),
        a6 = new TreeNode(6),
        a7 = new TreeNode(7),
        a8 = new TreeNode(8),
        a9 = new TreeNode(9);

    a1.left = a2;
    a1.right = a3;
    a2.left = a4;
    a4.left = a5;
    a4.right = a6;
    a3.left = a7;
    a3.right = a8;
    a8.left = a9;

    Solution one = new Solution();
    List<Integer> list = one.postorderTraversal(a1);
    for (int i :list)
      System.out.println(i);
  }
}