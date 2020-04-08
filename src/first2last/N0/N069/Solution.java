package first2last.N0.N069;

class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        //newton's method
        double temp = x/ (double)2;
        for (int i = 0; i < 100; i++){
            temp = 0.5* (temp + (x/temp));
        }
        return (int) temp;
    }

    public static void main(String[] args) {
        Solution one = new Solution();
        one.mySqrt(1);
    }
}