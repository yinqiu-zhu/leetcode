package first2last.N100199.N125;

class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) return true;
        int begin = 0, end = s.length() -1;
        char a, b;

        while ( begin < end ) {
            a = s.charAt(begin);
            b = s.charAt(end);
            if (48> a || ( a > 57 && 65 > a) || a > 90 &&
                    97 > a || a > 122 || a == ' ') {
                begin ++;
            }
            else if ( 48> b || ( b > 57 && 65 > b )|| (b > 90 &&
                    97 > b || b > 122) || b == ' ')
                end --;
            else {
                if (a > 57 && b <= 57 || a <= 57 && b > 57) return false;
                if ( a != b && a - 32 != b && a + 32 != b) return false;
                begin ++;
                end --;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "0P";
        Solution test = new Solution();
        test.isPalindrome(str);
    }
}
