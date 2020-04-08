package first2last.N1.N171;

class Solution {
    public int titleToNumber(String s) {

        if (s == null|| s.length()==0) return 0;

        int length = s.length();
        int res = 0;

        for (int i= 1; i < length; i++){
            res += (int) Math.pow(26,i);
        }

        for (int i = 0; i < length; i ++){
            int temp = s.charAt(i) - 65;
            temp= (int)Math.pow(26, length - i - 1)* temp;
            res = res + temp;
        }
        res++;
        return res;
    }

    public static void main(String[] args) {
        String A = "AB";
        Solution one = new Solution();
        one.titleToNumber(A);
    }
}