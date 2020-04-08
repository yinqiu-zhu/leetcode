package first2last.N2.N250CountUnivalueSubtrees;


class Solution {

  int count = 0;

  public int countUnivalSubtrees(TreeNode root) {

    if (root == null) return 0;

    dfs(root);
    return count;
  }

  public boolean dfs(TreeNode root){
    if (root == null) return true;
    if (root.left == null && root.right == null){
      count++;
      return true;
    }
    boolean right = dfs(root.right),
        left = dfs(root.left);
    if ( right && left &&
        (root.left == null || root.left.val == root.val) &&
        (root.right == null || root.right.val == root.val)){
      count ++;
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    TreeNode a1 = new TreeNode(1),
        a2 = new TreeNode(2),
        a3 = new TreeNode(3),
        a4 = new TreeNode(2),
        a5 = new TreeNode(5),
        a6 = new TreeNode(1),
        a7 = new TreeNode(1),
        a8 = new TreeNode(2),
        a9 = new TreeNode(1);

    a1.left = a2;
    a1.right = a3;
    a2.left = a4;
    a4.left = a5;
    a4.right = a6;
    a3.left = a7;
    a3.right = a8;
    a8.left = a9;

    Solution one = new Solution();
    System.out.println(one.countUnivalSubtrees(a1));
  }
}