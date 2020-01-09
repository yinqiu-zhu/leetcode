package old.ch3_QueueAndStack.CloneGraph_11;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {

  Map<Node,Node> map = new HashMap<>();

  public Node cloneGraph(Node node) {

    if (node == null || node.neighbors == null)
      return new Node();

    if (map.containsKey(node)) return map.get(node);

    Node cur = new Node();
    cur.val = node.val;
    cur.neighbors = new ArrayList<>();
    map.put(node, cur);

    for (Node one : node.neighbors){
    cur.neighbors.add(cloneGraph(one));
    }

    return cur;
  }

  public static void main(String[] args) {
    Node a1 = new Node();
    Node a2 = new Node();
    Node a3 = new Node();
    Node a4 = new Node();
    a1.val=1;
    a1.neighbors = new ArrayList<>();
    a1.neighbors.add(a2);
    a1.neighbors.add(a4);
    a2.val=2;
    a2.neighbors = new ArrayList<>();
    a2.neighbors.add(a1);
    a2.neighbors.add(a3);
    a3.val=3;
    a3.neighbors = new ArrayList<>();
    a3.neighbors.add(a4);
    a3.neighbors.add(a2);
    a4.val=4;
    a4.neighbors = new ArrayList<>();
    a4.neighbors.add(a1);
    a4.neighbors.add(a3);

    Solution one = new Solution();
    Node x =one.cloneGraph(a1);

    System.out.println(x.val);
    System.out.println(x.neighbors.get(0).val);
  }
}