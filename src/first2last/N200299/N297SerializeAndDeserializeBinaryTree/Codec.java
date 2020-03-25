package first2last.N200299.N297SerializeAndDeserializeBinaryTree;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

  // Encodes a tree to a single string.

  StringBuilder str;
  String data;
  int index;

  public String serialize(TreeNode root) {

    if (root == null)
      return new String();

    str = new StringBuilder();
    seriaHelper(root);

    return str.toString();
  }

  public void seriaHelper(TreeNode root){

    if (root == null){
      str.append('N');
    return;}

    str.append(root.val);
    str.append('#');

    seriaHelper(root.left);
    seriaHelper(root.right);
  }

  // Decodes your encoded data to tree.
  public TreeNode deserialize(String data) {

    if (data.length() == 0) return null;

    this.data = data;
    this.index = 0;

    return deHelper();
  }

  public TreeNode deHelper(){

    if (data.charAt(index) =='N') {
      index++;
      return null;
    }
    int val = 0, k = 1;
    if (data.charAt(index) == '-'){
      index++;
      k = -1;
    }

    while ( data.charAt(index)!= '#'){
      val = val * 10 + data.charAt(index) - 48;
      index ++;
    }
    TreeNode node = new TreeNode(k*val);

    index++;

    node.left = deHelper();
    node.right = deHelper();

    return node;
  }

  public static void main(String[] args) {
    TreeNode a1 = new TreeNode(1),
        a2 = new TreeNode(2),
        a3 = new TreeNode(-3),
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

    Codec one = new Codec();
    String st = one.serialize(a1);
    System.out.println(st);

    TreeNode tn = one.deserialize(st);
    sout(tn);
  }

  public static void sout(TreeNode root){
    if (root == null){
      System.out.println("N");
      return;
    };
    System.out.println(root.val);
    sout(root.left);
    sout(root.right);
  }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));