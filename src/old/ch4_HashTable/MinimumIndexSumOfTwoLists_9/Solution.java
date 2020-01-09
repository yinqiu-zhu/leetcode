package old.ch4_HashTable.MinimumIndexSumOfTwoLists_9;

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public String[] findRestaurant(String[] list1, String[] list2) {

    Map<String, Integer> map = new HashMap<>();
    String[] shorter = list1.length < list2.length? list1 : list2;
    list1 = shorter==list1? list2 : list1;

    for (int i = 0; i < shorter.length; i++){
      map.put(shorter[i], i);
    }

    int sum = Integer.MAX_VALUE, count = 0;

    for (int i = 0; i < list1.length; i++){
      if (map.containsKey(list1[i])){
        int temp = map.get(list1[i])+i;
        if (temp < sum){
          sum = temp;
          count = 1;
          list1[0] = list1[i];
        }
        else if (temp == sum){
          count ++;
          list1[count - 1] = list1[i];
        }
      }
    }
    String[] res = new String[count];
    for (int i = 0; i < count; i++){
      res[i] = list1[i];
    }
    return res;
  }

  public static void main(String[] args) {
    String[] l1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"},
        l2 ={"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
    Solution one = new Solution();
    one.findRestaurant(l1,l2);
  }
}
