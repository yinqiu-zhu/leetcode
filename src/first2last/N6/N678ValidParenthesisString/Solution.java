package first2last.N6.N678ValidParenthesisString;

class Solution {

    //BNF def:
    // phi ::= null | (phi) | * | (phi* | *phi) | phi phi
    // the parse tree is not unique.  e.g., *((* ())) = (( () )) or = (( () () ))
    // as a result, we cannot use a definition procedure to parse the tree.
    // therefor, naturally, there are two ways may solve the problem:
    // 1, every time a '*' occur, we store the possible parse tree, and then check to each tree, that's O(2^n).
    // 2, we store the possibility (the '*' occurrence) and for each time when we need consider one possibility, just remove it from the storage, that's O(n).
    public boolean checkValidString(String s) {
        int lo = 0, hi = 0;
        for (char c: s.toCharArray()) {
            lo += c == '(' ? 1 : -1;
            hi += c != ')' ? 1 : -1;
            if (hi < 0) break;
            lo = Math.max(lo, 0);
        }
        return lo == 0;
    }

    public static void main(String[] args) {
        String str = "(*(*)(((*)";
        Solution one = new Solution();
        System.out.println(one.checkValidString(str));
    }

}
