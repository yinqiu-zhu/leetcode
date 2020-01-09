package old.ch6_NaryTree.N428SerializeAndDeserializeNaryTree;

import old.ch6_NaryTree.Node;

import java.util.LinkedList;
import java.util.List;

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
class Codec {

  // Encodes a tree to a single string.
  StringBuilder str;
  String data;
  int index;

  public String serialize(Node root) {
    if (root == null)
      return new String();

    str = new StringBuilder();
    seriaHelper(root);
    return str.toString();
  }

  public void seriaHelper(Node root){

    str.append(root.val);
    str.append('#');

    if (root.children != null){
      str.append('[');
    for (Node node : root.children)
      seriaHelper(node);
    str.append(']');
    }

  }

  // Decodes your encoded data to tree.
  public Node deserialize(String data) {
    if (data.length() == 0) return null;

    this.data = data;
    this.index = 0;

    return deHelper(data);
  }

  public Node deHelper(String data){
    Node root = creatNode(data);
    if(data.charAt(index) == '['){
      root.children = new LinkedList<>();
      index++;
      while(data.charAt(index) != ']'){
        root.children.add(deHelper(data));
      }
      index++;
    }

    return root;
  }

  public Node creatNode(String data){
    int val = 0, k = 1;
    if (data.charAt(index) == '-'){
      index++;
      k = -1;
    }
    while ( data.charAt(index)!= '#'){
      val = val * 10 + data.charAt(index) - 48;
      index ++;
    }
    Node node = new Node();
    node.val = k*val;
    index++;
    return node;
  }

  public static void main(String[] args) {
    Codec one = new Codec();
    Node a1 = new Node();
    Node a2 = new Node();
    Node a3 = new Node();
    Node a4 = new Node();
    Node a5 = new Node();
    Node a6 = new Node();
    a1.val = 1;
    List<Node> a1_c = new LinkedList<>();
    a1_c.add(a3);
    a1_c.add(a2);
    a1_c.add(a4);
    a2.val = 2;
    a3.val = 3;
    a4.val = 4;
    List<Node> a3_c = new LinkedList<>();
    a3_c.add(a5);
    a3_c.add(a6);
    a5.val = 5;
    a6.val = 6;
    a3.children = a3_c;
    a1.children= a1_c;

    System.out.println(one.serialize(a1));
    String data = one.serialize(a1);
    soutN(one.deserialize(data));
  }

  public static void soutN(Node root){
    if (root == null){
      System.out.println("N");
      return; }
    System.out.println(root.val);
    if (root.children != null)
      for (Node a : root.children){
        soutN(a);
      }
  }

}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));