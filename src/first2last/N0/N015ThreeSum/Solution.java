package first2last.N0.N015ThreeSum;


import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) return new LinkedList<>();

        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else {
                map.put(nums[i], 1 );
            }
        }

        for (int i = 0; i < nums.length; ){
            for (int j = i+1; j < nums.length; ){
                int target = 0 - nums[i] - nums[j];
                if (target >= nums[j]) {
                    if (map.containsKey(target) && (
                            ( nums[i]!= 0 && (target != nums[j] ||  map.get(nums[j]) >= 2)) || 
                                    (nums[i] == 0 && map.get(0) >= 3))
                    ){
                        List<Integer> temp = new ArrayList<>(3);
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(target);
                        ans.add(temp);
                    }
                    if (nums[i] == nums[j]) j --;
                    j = j + map.get(nums[j]);
                }
                else break;
            }
            i = i + map.get(nums[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Solution solution = new Solution();
        solution.threeSum(nums);
    }
}
