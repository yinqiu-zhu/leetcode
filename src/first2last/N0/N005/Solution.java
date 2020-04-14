package first2last.N0.N005;

import java.util.HashSet;
import java.util.Set;

class Solution {

    //DP solution

    public String longestPalindrome(String s) {

        if (s == null || s.length() == 0) return "";

        Set<String> set = new HashSet<>();

        final int LEN = s.length();
        int start = 0, end = 0;
        boolean[][] dp = new boolean[LEN][LEN];

        for (int i = 0; i < LEN; i++ ){
            for (int j = i; j >= 0; j--){

                if (set.contains(i+"|"+j)) break;

                boolean temp  =  s.charAt(i) == s.charAt(j);
                if ( i == j )
                    dp[i][j] = true;
                else if (i - 1 == j ) dp[i][j] = temp;
                else if ( temp && dp[i-1][j+1]) dp[i][j] = true;

                set.add(i+"|"+j);
                if (dp[i][j] && i - j > end - start){
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start,end+1);
    }

    public static void main(String[] args) {
        String a = "babad";
        Solution one = new Solution();
        System.out.printf(one.longestPalindrome(a));
    }
}
