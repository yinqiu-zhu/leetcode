package first2last.N100199.N191;

public class Solution {
    // you need to treat n as an unsigned value

    // a practice with bitwise operator.
    public int hammingWeight1(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++){
            if ((n & 1) == 1)
                ans++;
            n = n >>> 1;
        }
        return ans;
    }

    // an optimization
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
