package first2last.N5.N525ContiguousArray;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findMaxLength(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        int ans = 0 , count =0;

        for (int i=0; i < nums.length; i++){
            count = nums[i]== 1? count+1: count-1;
            if (count == 0){
                if (ans < i+1)
                    ans = i+1;
            }
            else if (!map.containsKey(count)){
                    map.put(count,i);
                }
                else {
                    int temp = i - map.get(count) ;
                    if (ans < temp) ans = temp;
                }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a = {0,1};
        Solution one = new Solution();
        System.out.print(one.findMaxLength(a));
    }
}
