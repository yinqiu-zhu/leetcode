package ch7_Trie.N208ImplementTrie;

class Trie {

  /** Initialize your data structure here. */

  public Trie root;
  public Trie[] children;
  private int index;

  public Trie() {
  }

  /** Inserts a word into the trie. */
  public void insert(String word) {
    Trie pos = pos(word);
    int index = this.index;
    while (index < word.length()){
      if (pos.children == null)
        pos.children = new Trie[26];
      pos.children[word.charAt(index)] = new Trie();
    }
  }


  public Trie pos(String word){
    Trie temp = root;
    index = 0;
    while (temp.children != null && temp.children[word.charAt(index) - 97] != null ){
      temp = temp.children[word.charAt(index) - 97];
      index++;
    }
    return temp;
  }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
