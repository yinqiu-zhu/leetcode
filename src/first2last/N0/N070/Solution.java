package first2last.N0.N070;

public class Solution {
    public int climbStairs(int n) {
        //F(n) = F(n-1) + F(n-2), where F(n-1) plussing one step reaches to F(n), and F(n-2) plussing two step does.
        int[] memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;
        for (int i = 2; i <= n; i++){
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }
}
