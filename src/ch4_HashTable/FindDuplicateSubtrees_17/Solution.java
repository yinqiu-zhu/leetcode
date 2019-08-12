package ch4_HashTable.FindDuplicateSubtrees_17;


import java.util.*;

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

  Map<String, TreeNode> codingMap = new HashMap<>();
  Map<TreeNode,String> getCode = new HashMap<>();
  Set<TreeNode> ans = new HashSet<>();

  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {

    // exception
    if (root == null ) return new ArrayList<>();
    getCode.put(null,"#");

    //body
    dfs(root);
    List<TreeNode> list = new ArrayList(ans);
    return list;
  }

  public void dfs (TreeNode root){

    System.out.println(root.val + "->");

    //case : leaf - basis
    if (root.left == null && root.right == null){

      System.out.println(root.val);

      String code = root.val + "";
      getCode.put(root, code);
      if (codingMap.containsKey(code)){
        ans.add(codingMap.get(code));
      }
      else codingMap.put(code, root);
    }

    //case : non leaf node - induction
    else {
      if (root.left != null) dfs(root.left);
      if (root.right != null) dfs(root.right);
      String code = root.val + "," + getCode.get(root.left) + "," +getCode.get(root.right);
      getCode.put(root, code);
      if (codingMap.containsKey(code)){
        ans.add(codingMap.get(code));
      }
      else codingMap.put(code, root);
    }
  }

  public static void main(String[] args) {
    Solution one = new Solution();

    //test1
    {
      TreeNode t1 = new TreeNode(1);
      TreeNode t2 = new TreeNode(2);
      TreeNode t3 = new TreeNode(3);
      TreeNode t4 = new TreeNode(4);
      TreeNode t5 = new TreeNode(2);
      TreeNode t6 = new TreeNode(4);
      TreeNode t7 = new TreeNode(4);
      t1.left = t2;
      t1.right = t3;
      t2.left = t4;
      t3.left = t5;
      t3.right = t6;
      t5.left =t7;

      List<TreeNode> ans = one.findDuplicateSubtrees(t1);
      System.out.println("answer:");
      for (TreeNode i : ans)
        System.out.println(i.val);
    }
  }
}