package first2last.N200299.N242;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0) return t.length() == 0;

        int[] map = new int[26];

        for (char ch: s.toCharArray()){
            map[ch - 'a'] ++;
        }

        for (char ch: t.toCharArray()){
            map[ch - 'a'] --;
        }

        for (int i : map){
            if (i != 0) return false;
        }

        return true;
    }
}
