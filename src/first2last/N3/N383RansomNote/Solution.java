package first2last.N3.N383RansomNote;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] store = new int[26];
        for (char ch : magazine.toCharArray()){
            store[ch - 'a'] ++;
        }
        for (char ch : ransomNote.toCharArray()){
            if (store[ch - 'a'] > 0){
                store[ch - 'a'] --;
            }
            else return false;
        }

        return true;
    }
}
