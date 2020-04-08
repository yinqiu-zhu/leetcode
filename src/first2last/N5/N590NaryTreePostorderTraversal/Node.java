package first2last.N5.N590NaryTreePostorderTraversal;

import java.util.List;

public class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
      val = _val;
      children = _children;
    }
}
