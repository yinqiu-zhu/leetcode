package first2last.N1.N106ConstructBinaryTreeFromInorderAndPostorderTraversal;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  int[] inorder, postorder;
  Map<Integer, Integer> map = new HashMap<>();

  public TreeNode buildTree(int[] inorder, int[] postorder) {
    this.inorder = inorder;
    this.postorder = postorder;
    if (postorder.length == 0 || postorder == null) return null;
    return buildSubtree(0, postorder.length - 1,0);
  }

  public TreeNode buildSubtree(int i, int j, int inorderResidual){

    // i is the start point of this sub-array, and j is the end one.

    if (i > j) return null;

    TreeNode root = new TreeNode(postorder[j]);

    if (i == j ) return root;

    int k = map.get(postorder[j]) - i - inorderResidual;

    for (; k < j - i; k++ ){
      if (inorder[i + inorderResidual + k] == postorder[j]) break;
    }
    root.left = buildSubtree(i, i + k - 1, inorderResidual);
    root.right = buildSubtree(i + k, j - 1, inorderResidual +1);
    return root;
  }

  public static void main(String[] args) {

    Solution one = new Solution();

    TreeNode x= one.buildTree(new  int[]{9,3,15,20,7}, new int[]{9,15,7,20,3});

    sout(x);
  }

  public static void sout(TreeNode root){
    if (root == null){
      System.out.println("#");
      return;
    };
    System.out.println(root.val);
    sout(root.left);
    sout(root.right);
  }
}
