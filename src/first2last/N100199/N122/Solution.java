package first2last.N100199.N122;

class Solution {

    int[] nums;
    int length;

    public int maxProfit(int[] prices) {

        nums = prices;
        length = prices.length;
        int earn = 0;
        int pos = findTrough(0);

        while (pos < length){
            int priceIn = nums[pos];
            pos = findPeak(pos);
            earn += nums[pos] - priceIn;
            pos = findTrough(pos);
        }
        return earn;
   }

    private int findTrough( int pos){
        while (pos < length){
            if (pos + 1 < length && nums[pos] < nums[pos + 1])
                return pos;
            pos++;
        }
        return length;
    }

    private int findPeak( int pos){
        while (pos < length){
            if (pos + 1 < length && nums[pos] > nums[pos + 1])
                return pos;
            pos++;
        }
        return length - 1;
    }
}