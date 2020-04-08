package first2last.N0.N003;

import java.util.HashMap;
import java.util.Map;

/**
 * + ###N003   Longest Substring Without Repeating Characters
 * + Given a string, find the length of the longest substring without repeating characters.
 * + **Example 1**: Input: "abcabcbb", Output: 3, Explanation: The answer is "abc", with the length of 3.
 * + **Example 2**: Input: "bbbbb", Output: 1, Explanation: The answer is "b", with the length of 1.
 * + **Example 3**: Input: "pwwkew", Output: 3, Explanation: The answer is "wke", with the length of 3.
 * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Solution {

    public int lengthOfLongestSubstring(String s) {
        /**
         * Runtime: 7 ms, faster than 81.33% of Java online submissions for Longest Substring Without Repeating Characters.
         * Memory Usage: 35.7 MB, less than 100.00% of Java online submissions for Longest Substring Without Repeating Characters.
         */

        if (s == null || s.length() == 0) {
            return 0;
        }

        int count = 0; // to store the largest number of the aimed substring.
        int head = 0, tail = 0; // indicate the concerned substring now.
        Map<Character, Integer> store = new HashMap<>();

        while (tail < s.length()) {
            char ch = s.charAt(tail);
            if (store.containsKey(ch)) {
                int pos = store.get(ch);
                if (pos >= head) {
                    head = pos + 1;
                }
            }
            store.put(ch, tail);
            int temp = tail - head + 1;
            if (count < temp) {
                count = temp;
            }
            tail++;
        }
        return count;
    }

    public int lengthOfLongestSubstring2(String s) {

        /**
         * Runtime: 2 ms, faster than 99.72% of Java online submissions for Longest Substring Without Repeating Characters.
         * Memory Usage: 36.9 MB, less than 99.76% of Java online submissions for Longest Substring Without Repeating Characters.
         */
        if (s == null || s.length() == 0) {
            return 0;
        }

        int count = 0;
        int head = 0;
        boolean[] store = new boolean[256];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (store[ch]) {
                store[s.charAt(head++)] = false;
            }
            store[ch] = true;
            count = Math.max(count, i - head + 1);
        }
        return count;
    }

}
