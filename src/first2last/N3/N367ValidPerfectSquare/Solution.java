package first2last.N3.N367ValidPerfectSquare;

class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, h = num;
        int mid;
        while ( l <= h){
            mid = (h - l) / 2 + l;
            int res = num/ mid, tail = num % mid;
            if (res == mid && tail == 0  ) return true;
            if ( mid >= res){
                h = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution one = new Solution();
        one.isPerfectSquare(808202);
    }
}