package first2last.N7.N705DesignHashSet;

import java.util.ArrayList;
import java.util.List;

class MyHashSet {

  /** Initialize your data structure here. */
  static final int rangMax = 1000000;
  static final int numberOfBuckets = 10000;
  List<Integer>[] bucket;

  public MyHashSet() {
    bucket = (List<Integer>[]) new ArrayList[numberOfBuckets];
  }

  private int getIndex(int num){
    if (num <= rangMax) return num % numberOfBuckets;
    else return -1;
  }

  private int getPos(int num, int index){
    List<Integer> temp = bucket[index];
    if (temp == null) return -1;
    for (int i = 0; i < temp.size(); i++){
      if (temp.get(i) == num) return i;
    }
    return -1;
  }

  public void add(int key) {

    int index = getIndex(key);
    if (index == -1) return;
    int pos = getPos(key, index);
    if (pos < 0) {
      if (bucket[index] == null) bucket[index] = new ArrayList<Integer>();
      bucket[index].add(key);
    }
  }

  public void remove(int key) {

    int index = getIndex(key);
    if (key == -1) return;
    int pos = getPos(key, index);
    if (pos == -1) return;
    bucket[index].remove(pos);

  }

  /** Returns true if this set contains the specified element */
  public boolean contains(int key) {

    int index = getIndex(key);
    if (index == -1) return false;
    int pos = getPos(key, index);
    if (pos == -1 ) return false;
    return true;
  }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
