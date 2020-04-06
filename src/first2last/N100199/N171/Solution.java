package first2last.N100199.N171;

class Solution {

    public int titleToNumber(String s) {

        if (s == null|| s.length()==0) return 0;

        int leng = s.length();
        int carry = 0, res = 0;
        for (int i = s.length()-1; i >= 0; i--){
            int position = s.charAt(i) - 64;

            res = res + ;
            carry =  
        }

        return res;
    }
}