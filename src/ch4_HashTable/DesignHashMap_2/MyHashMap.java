package ch4_HashTable.DesignHashMap_2;


import java.util.ArrayList;
import java.util.List;


class Pair{
  int key, value;

  public Pair(int key, int value){
    this.key = key;
    this.value = value;
  }

  public int getKey(){
    return key;
  }

}

class MyHashMap {


  /** Initialize your data structure here. */
  final static int Max_operation = 10000;
  private List<Pair>[] map;

  public MyHashMap() {
    map = new List[Max_operation];
  }

  private int pos(int key){

    int index = key % Max_operation;
    if (index < 0 ) return -2;
    List<Pair> temp = map[index];
    if (temp == null) return -1;
    for (int i = 0; i < temp.size(); i++){
      if (temp.get(i).getKey() == key) return i;
    }
    return -1;

  }

  /** value will always be non-negative. */
  public void put(int key, int value) {

    int pos = pos(key), index = key % Max_operation;

    if (pos == -2) return;

    Pair one = new Pair(key,value);
    if (pos == -1){
      if (map[index] == null){
        map[index] = new ArrayList<Pair>();
      }
      map[index].add(one);
    }
    else map[index].set(pos, one);

  }

  /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
  public int get(int key) {

    int pos = pos(key);
    if (pos < 0) return -1;
    else return map[key % Max_operation].get(pos).value;

  }

  /** Removes the mapping of the specified value key if this map contains a mapping for the key */
  public void remove(int key) {

    int pos = pos(key);
    if (pos >= 0) {
      map[key % Max_operation].remove(pos);
    }

  }

  public static void main(String[] args) {
    MyHashMap one = new MyHashMap();
    one.put(1,1);
    one.put(1,2);
  }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */