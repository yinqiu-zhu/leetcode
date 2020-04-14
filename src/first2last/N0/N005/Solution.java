package first2last.N0.N005;


class Solution {

    //DP solution
    public String longestPalindrome1(String s) {

        if (s == null || s.length() == 0) return "";

        final int LEN = s.length();
        int start = 0, end = 0;
        boolean[][] dp = new boolean[LEN][LEN];

        for (int i = 0; i < LEN; i++ ){
            for (int j = i; j >= 0; j--){
                boolean temp  =  s.charAt(i) == s.charAt(j);
                if ( i == j ) dp[i][j] = true;
                else if (i - 1 == j ) dp[i][j] = temp;
                else if ( temp && dp[i-1][j+1]) dp[i][j] = true;

                if (dp[i][j] && i - j > end - start){
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start,end+1);
    }
}

