package ch1_arrayAndString;

public class rotateArray1_16 {

  public void rotate1(int[] nums, int k) {
    int size = nums.length;
    k = k % size;
    int[] clone = nums.clone();
    for (int i = 0; i < k; i++)
      nums[i] = clone[size - (k - i)];
    for (int i = k; i < size; i++) {
      nums[i] = clone[i - k];
    }
  }

  //  public void rotate2(int[] nums, int k) {
//
//  }

  public void rotate3(int[] nums, int k) {

    int size = nums.length;
    k = k % size;

    reverse(nums, 0, size - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, size - 1);

  }

  public void reverse(int[] nums, int a, int b) {
    int temp = 0;
    while (a < b) {
      temp = nums[a];
      nums[a] = nums[b];
      nums[b] = temp;
      a++;
      b--;
    }
  }

  public static void main(String... args) {

    int[] a = {1, 2, 3, 4, 5};
    int b = 9;
    rotateArray1_16 n = new rotateArray1_16();
    n.rotate1(a, b);
  }
}
