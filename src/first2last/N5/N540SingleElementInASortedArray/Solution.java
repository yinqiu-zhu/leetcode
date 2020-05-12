package first2last.N5.N540SingleElementInASortedArray;

class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) return -1;

        int h = nums.length - 1, l = 0, mid;
        if (h == 0) return nums[0];

        while (l <= h ){
            mid = l + (h - l)/2;
            if (    h == l ||
                    (mid + 1 > h && nums[mid] != nums[mid - 1]) ||
                    (mid -1 < l && nums[mid] != nums[mid +1]) ||
                    (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) )
                return nums[mid];
            if (nums[mid] == nums[mid - 1] ){
                if ( (mid - 2) % 2 == 0){  // the single occurrence is in the left of mid;
                    h = mid - 2;
                }
                else l = mid + 1; // the single occurrence is in the right of mid;
            }
            else {
                if ( (mid - 1) % 2 == 0){
                    h = mid - 1;
                }
                else l = mid + 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution x = new Solution();
        System.out.println(x.singleNonDuplicate(new int[] {1,2,2,3,3}));
    }


}
