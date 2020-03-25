package first2last.N100199.N102BinaryTreeLevelOrderTraversal;



import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {

    Queue<TreeNode> que = new LinkedList();
    List<List<Integer>> ans = new LinkedList<>();
    if (root == null) return ans;
        que.offer(root);

    while (que.size() != 0){
      List<Integer> nowLevel = new LinkedList<>();
      TreeNode temp = que.poll();
      que.offer(null);
      while (temp != null){
        nowLevel.add(temp.val);
        if (temp.left!= null) que.offer(temp.left);
        if (temp.right!= null) que.offer(temp.right);
        temp = que.poll();
      }
      ans.add(nowLevel);
    }

    return ans;
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
    List<List<Integer>> list = one.levelOrder(a1);
    for (List<Integer> i :list){
      System.out.println("[");
      for (int j :i){
        System.out.print(j + ",");
      }
    System.out.print("]");
    System.out.println( );
  }}
}
