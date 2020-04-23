package first2last.N2.N201BitwiseANDofNumbersRange;

class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) return 0;
        int moveFactor = 1;
        while (m != n ){
            m = m >> 1;
            n = n >> 1;
            moveFactor = moveFactor << 1;
        }
        return moveFactor * m;
    }
}
