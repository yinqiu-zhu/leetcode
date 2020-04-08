package first2last.N3.N326PowerOfThree;

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 0) return false;
        double res = Math.log10(n) / Math.log10(3);
        return res == (int) res;
    }
}
