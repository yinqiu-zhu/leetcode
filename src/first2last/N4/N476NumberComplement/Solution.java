package first2last.N4.N476NumberComplement;

class Solution {
    public int findComplement(int num) {

        int count = 0, a = num;
        for (int i = 0; i < 32; i++){
            if ( (a & 1) == 0){
                count++;
            }
            else {
                count = 0;
            }
            a = a >> 1;
        }

        return ( (~num) << count) >>> count;
    }

    public static void main(String[] args) {
        Solution a = new Solution();
        a.findComplement(5);
    }
}
