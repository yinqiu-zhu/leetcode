package first2last.N0.N038;

class Solution {
    public String countAndSay(int n) {

        if ( n == 1) return "1";
        StringBuilder str = new StringBuilder();
        int count = 0;
        char last = '#';
        char[] temp = countAndSay(n - 1).toCharArray();
        for (char i : temp){
            if (last == i){
                count ++;
            }
            else {
                str.append(count).append(last);
                count = 1;
                last = i;
            }
        }
        str.append(count).append(last);
        str.delete(0,2);
        return str.toString();
    }

    public static void main(String[] args) {
        Solution one = new Solution();
        one.countAndSay(4);
    }
}