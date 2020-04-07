package first2last.N200299.N204;

class Solution {
    public int countPrimes(int n) {

        boolean[] nums = new boolean[n+1];
        int count = 0;
        for (int i = 2; i <= n; i++){
            if ( !nums[i] ){
                count ++;
                for (int j = 2; i*j <= n; j++){
                    nums[i*j] = true;
                }
            }
        }
        return count;
    }
}
