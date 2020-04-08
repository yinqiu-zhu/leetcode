package first2last.N1.N172;

public class Solution {
    public int trailingZeroes(int n) {
        int ans = 0;
        while (n >= 5){
            n = n/5;
            ans += n;
        }

        return ans;
    }
}
