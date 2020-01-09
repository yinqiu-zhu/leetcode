package old.ch0.N007ReverseInteger;

class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0   ){
            if (res < Integer.MAX_VALUE / 10 && res > Integer.MIN_VALUE / 10)
                return 0;
            res = res * 10 + x % 10;
            x = x / 10;
        }
    return res;
    }

    public static void main(String[] args) {
        System.out.println(-1 % 2);
    }
}
