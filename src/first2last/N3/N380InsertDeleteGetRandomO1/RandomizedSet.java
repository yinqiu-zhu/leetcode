package first2last.N3.N380InsertDeleteGetRandomO1;

import java.util.*;

class RandomizedSet {

  /** Initialize your data structure here. */
  Map<Integer,Integer> map;
  List<Integer> list;
  public RandomizedSet() {
    map = new HashMap<>();
    list = new ArrayList<>();
  }

  /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
  public boolean insert(int val) {
    if (map.containsKey(val)) return false;
    map.put(val, list.size());
    list.add(val);
    return true;
  }

  /** Removes a value from the set. Returns true if the set contained the specified element. */
  public boolean remove(int val) {
    if (!map.containsKey(val)) return false;
    int last = list.get(list.size() - 1);
    map.put(last, map.get(val));
    list.set(map.get(val), last);
    list.remove(list.size() - 1);
    map.remove(val);
    return true;
  }

  /** Get a random element from the set. */
  public int getRandom() {
    double ran = Math.random();
    return list.get((int) (Math.random() * list.size()));
  }

  public static void main(String[] args) {
    RandomizedSet one = new RandomizedSet();
    one.insert(1);
    one.insert(10);
    one.insert(20);
    one.insert(30);
    System.out.println(one.getRandom());
    System.out.println(one.getRandom());
    System.out.println(one.getRandom());
    System.out.println(one.getRandom());
    System.out.println(one.getRandom());
    System.out.println(one.getRandom());
    System.out.println(one.getRandom());
  }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */