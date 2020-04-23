package first2last.N5.N560SubarraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraySum(int[] nums, int k) {

        if (nums == null || nums.length == 0) return 0;

        int  sum = 0, count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(sum, 1);
        for (int i : nums){

            sum += i;
            if (map.containsKey( sum - k))
                count += map.get(sum - k);
            if (map.containsKey(sum))
                map.replace( sum, map.get(sum)+1 );
            else map.put(sum, 1);

        }

        return count;
    }
}