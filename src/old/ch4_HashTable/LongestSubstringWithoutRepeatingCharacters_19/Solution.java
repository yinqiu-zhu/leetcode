package old.ch4_HashTable.LongestSubstringWithoutRepeatingCharacters_19;


class Solution {
  public int lengthOfLongestSubstring(String s) {
    if(s == null || s.length() == 0) return 0;
    int count = 0;
    int [] map = new int[128];
    int head = 0;

    for (int i = 0; i < s.length(); i++){
      int cur =s.charAt(i);
      if (map[cur] == 1){
        int move = s.charAt(head);
        while (cur  != move){
         map[move] = 0;
         head ++;
          move = s.charAt(head);
        }
        head ++;
      }
      else {
      map[cur] = 1;
      count = (i - head + 1) > count ? (i - head + 1) : count;}
    }
    return count;
  }

  public static void main(String[] args) {
    Solution one = new Solution();
    String str = "hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    System.out.println(one.lengthOfLongestSubstring(str));
  }

  //Runtime: 2 ms, faster than 99.88% of Java online submissions for Longest Substring Without Repeating Characters.
  //Memory Usage: 37.6 MB, less than 81.37% of Java online submissions for Longest Substring Without Repeating Characters.
}