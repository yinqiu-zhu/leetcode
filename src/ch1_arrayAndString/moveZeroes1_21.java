package ch1_arrayAndString;

public class moveZeroes1_21 {

  public void moveZeroes(int[] nums) {

    if (nums == null || nums.length ==0 ) return;

    for (int j = 0; j < nums.length; j++){

      if (nums[j] == 0){
        int i = j;
        while (i < nums.length - 1 && nums[i] == 0){
          i++;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
      }
    }
  }

  public void moveZeroes2(int[] nums) {

    if (nums == null || nums.length ==0 ) return;

    int i  = 0;

    for (int j = 0; j < nums.length; j++){

      if (nums[j] != 0){
        nums[i] = nums[j];
        i++;
        }
  }
    while (i < nums.length){
    nums[i] = 0;
    i++;
    }
  }
}

