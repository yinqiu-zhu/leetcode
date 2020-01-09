package old.ch1_arrayAndString;

public class pivotIndex1_2 {

  public int pivot(int[] nums) {

    if (nums == null) {
      return -1;
    }

    int size = nums.length;

    // sum is the sum of nums
    int sum = 0;
    for (int item : nums) {
      sum = sum + item;
    }

    //
    int left = 0, right =sum;

    for (int i = 0; i <= size-1; i++) {


      if ( i-1 >= 0 ) {
        left = left + nums[i-1];
      }

      right = right - nums [i];

      if (left == right ) {
        return i;
      }

    }

    return -1;}

  public pivotIndex1_2() {
    int b = 0;
  }


  public static void main(String... args) {

    int[] a = {0};
    pivotIndex1_2 n = new pivotIndex1_2();
    System.out.println(n.pivot(a));

  }
}