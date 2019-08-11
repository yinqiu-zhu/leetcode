package ch1_arrayAndString;

public class removeDuplicatesFromSortedArray1_20 {
  public int removeDuplicates(int[] nums) {

    if (nums == null || nums.length == 0) return 0;

    int res = 0, position =0, target=Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] > target) {
        res++;
        target = nums[i];
      }
      else {

        while (position < nums.length - 1 && nums[position]<= target){
          position ++;
        }

        if (target < nums [position]) {
          target= nums [position];
          res++;
          nums[i] = nums[position];
        }


      }

    }
//    for (int i = 1; i <= position; i++) {
//
//      if (nums[last] == nums[position]) break;
//
//      while (position > 0 && nums[position] == nums[position - 1] ) {
//        position--;
//      }
//
//      if (nums[i] == nums[last]) {
//        nums[i] = nums[position];
//        position --;
//      } else {
//        last = i;
//      }
//      res++;
//    }
    return res;
  }

  public static void main(String... args) {

    {
      int[] a = {1,1,2};
      removeDuplicatesFromSortedArray1_20 n = new removeDuplicatesFromSortedArray1_20();
      System.out.println(n.removeDuplicates(a));
    }
  }

}
