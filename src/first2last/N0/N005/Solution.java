package first2last.N0.N005;


import java.util.HashMap;
import java.util.Map;

class Solution {
    //DP solution
    Map<String,int[]> map = new HashMap<>();
    char[] s;
    public String longestPalindrome(String s) {
        this.s = s.toCharArray();

    }

    private int[] dp(int i, int j){

        if ( i == j ) return new {i,i};

        String temp = ;
        if (map.containsKey(temp)) return map.get(temp);
        else {

        }
    }
}