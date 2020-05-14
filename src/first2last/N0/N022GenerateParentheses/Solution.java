package first2last.N0.N022GenerateParentheses;

import java.util.ArrayList;
import java.util.List;

class Solution {


    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if( n == 0 ) ans.add("");
        else {
            for (int i = 0; i < n; i++){
                for ( String left: generateParenthesis(i))
                    for (String right: generateParenthesis(n -i - 1))
                        ans.add("(" + left + ")" + right);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution x = new Solution();
        x.generateParenthesis(4);
    }
}
