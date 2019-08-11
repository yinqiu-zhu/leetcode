package ch1_arrayAndString;

public class removeElement1_13 {
  public int removeElement(int[] nums, int val) {
    int len = nums.length;
    for (int i = 0 ; i< len; ++i){
      while (nums[i]==val && i< len) {
        nums[i]=nums[--len];
      }
    }
    return len;
  }

  public static void main(String... args) {

    {
      int[] a = {0, 1, 2, 2, 3, 0, 4, 2, 2};
      int b = 2;
      removeElement1_13 n = new removeElement1_13();
      System.out.println(n.removeElement(a, b));
    }
  }
}
