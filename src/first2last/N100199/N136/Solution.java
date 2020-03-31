package first2last.N100199.N136;


import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int singleNumber(int[] nums){
        Set<Integer> set = new HashSet<>();

        for (Integer i : nums){
            if ( !set.contains(i) ) set.add(i);
            else set.remove(i);
        }

        int res = 0;
        for ( Integer i : set){
            res = i;
        }

        return res;
    }

    public int singleNumber2(int[] nums){
        int res = 0;
        for (int i : nums)
            res ^= i;
        return res;
    }
}
