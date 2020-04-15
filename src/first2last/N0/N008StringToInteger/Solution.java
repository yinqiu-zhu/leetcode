package first2last.N0.N008StringToInteger;

class Solution {
    public int myAtoi(String str) {

        if (str == null || str.length() == 0) return 0;

        int ans = 0, pos = 0, sign = 1;

        //remove space
        while (pos< str.length() && str.charAt(pos) == ' '){
            pos++;
        }
        if (pos == str.length()) return ans;

        //handle signs
        if (str.charAt(pos) == '+' || str.charAt(pos) == '-'){
            sign = str.charAt(pos) == '+' ? 1 : -1;
            pos++;
        }

        //convert number and avoid overflow
        for (; pos < str.length(); pos++){
            int cur = str.charAt(pos) - '0';
            if (cur < 0 || cur > 9 ) break;

            if (Integer.MAX_VALUE/10 < ans || Integer.MAX_VALUE/10 == ans && 7 < cur){
                if (sign == 1) return Integer.MAX_VALUE;
                else return Integer.MIN_VALUE;
            }

            ans = 10*ans + cur;
        }
        return sign*ans;
    }

    public static void main(String[] args) {
        String a = "2147483646";
        Solution tst = new Solution();
        System.out.println(tst.myAtoi("1") );
    }
}