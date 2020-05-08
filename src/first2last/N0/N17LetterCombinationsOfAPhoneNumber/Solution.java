package first2last.N0.N17LetterCombinationsOfAPhoneNumber;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Solution {

    List<String> ans = new LinkedList<>();
    Map<Character, String> phone = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    public List<String> letterCombinations(String digits) {

        if (digits == null || digits.length() == 0) return ans;
        backtracking(digits, "");
        return ans;
    }

    private void backtracking(String digit, String combination){
        if (digit.length() == 0)
            ans.add(combination);
        else {
            char letter = digit.charAt(0);
            digit = digit.substring(1);

            for ( char ch : phone.get(letter).toCharArray()){
                backtracking(digit, combination + ch);
            }
        }
    }
}