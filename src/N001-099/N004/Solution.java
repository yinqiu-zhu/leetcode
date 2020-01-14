package first2last.N004;

/**
 *
 + ###N004   Median of Two Sorted Arrays
 + There are two sorted arrays nums1 and nums2 of size m and n respectively.
 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 You may assume nums1 and nums2 cannot be both empty.
 + **Example 1**:
 nums1 = [1, 3],
 nums2 = [2],
 The median is 2.0
 + **Example 2**:
 nums1 = [1, 2],
 nums2 = [3, 4],
 The median is (2 + 3)/2 = 2.5
 */

class Solution {
    //the longer array among the two given arrays. If the lengths are same, choose the latter.
    //the longer array must has a valid split position (at least is t,he first element).
    int[] longer, shorter;
    boolean isOdd;

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int nums1Length = nums1.length, nums2Length = nums2.length;

        isOdd = (nums1Length + nums2Length) % 2 == 1;

        if (nums1Length > nums2Length){
            longer = nums1;
            shorter = nums2;
        }
        else {
            longer = nums2;
            shorter = nums1;
        }

        int mid = longer.length / 2 ;

        while (isPosValid(mid) == false){
            mid = findSplitPosition(mid);
        }


    }

    private int findSplitPosition(int pos){
        return (longer.length - pos) / 2 + pos;
     }

    private boolean isPosValid(int pos){

    }
}