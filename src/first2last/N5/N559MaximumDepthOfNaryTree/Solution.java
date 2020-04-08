package first2last.N5.N559MaximumDepthOfNaryTree;


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {

  public int maxDepth(Node root) {

    if (root == null) return 0;

    int sum = 1;

    for (Node child : root.children){
      sum = Math.max(maxDepth(child)+1,sum);
    }

    return sum;
  }
}