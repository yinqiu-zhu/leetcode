package first2last.N3.N371SumOfTwoIntegers;

public class Solution {
    public int getSum(int a, int b) {
        if ( a == 0) return b;
        return getSum( (a&b)<<1, a^b ); //a&b means find the carry of a+b<<1, and a^b means find the not-carry part of a+b;
    }
}
