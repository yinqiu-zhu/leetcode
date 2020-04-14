package first2last.N8.N844BackspaceStringCompare;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>(), stackT = new Stack<>();
        for (char ch : S.toCharArray()){
            if (ch == '#'){
                if (!stackS.empty()) stackS.pop();
            }
            else stackS.push(ch);
        }
        for (char ch : T.toCharArray()){
            if (ch == '#') {
                if (!stackT.empty()) stackT.pop();
            }
            else stackT.push(ch);
        }
        while (!stackS.empty()){
            if (stackT.empty() || stackS.pop() != stackT.pop())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "ab##a", t = "c#d#";
        Solution one = new Solution();
        one.backspaceCompare(s,t);
    }
}
