package first2last.N100199.N169;

public class Solution {
    // Boyer-Moore Voting Algorithm
    public int majorityElement(int[] nums) {
        int count = 0;
        int cur = 0;

        for (int i : nums){
            if (cur != i)
                if (count == 0)  {
                    count = 1;
                    cur = i;
                }
                else count--;
            else count++;
        }

        return cur;
    }
}
