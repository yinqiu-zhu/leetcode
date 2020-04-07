package AprilChallenge.CountingElements;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countElements(int[] arr) {

        Map<Integer,Integer> map = new HashMap();
        int count = 0;
        for (int i: arr){
            if (map.containsKey(i)){
                map.replace(i,map.get(i)+1);
                if (map.containsKey(i+1)) count++;
            }
            else {
                map.put(i, 1);
                if (map.containsKey(i+1)) count++;
                if (map.containsKey(i-1)) count += map.get(i-1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution one = new Solution();
        int[] test = {1,1,3,3,5,5,7,7};
        one.countElements(test);
    }
}
