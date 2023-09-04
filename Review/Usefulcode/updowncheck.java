package Review.Usefulcode;

import java.util.Arrays;

public class updowncheck {

public static void main(String[] args) {
  
  System.out.println(sortArrayByParity(new int[] {111, 2, 309, 4, 1}));

}

public static String sortArrayByParity(int[] nums) {

  int i = 0;
  int j = nums.length - 1;
  int temp = 0;

  while (i < j) {
    System.out.println("before:");
    System.out.print("[i]= " + i + " ");
    System.out.println("nums[i]= " + nums[i]);
    System.out.print("[j]= " + j + " ");
    System.out.println("nums[j]= " + nums[j]);
    System.out.println("temp =" + temp);
    System.out.println("end" + Arrays.toString(nums));
    System.out.println();

    if (nums[i] % 2 == 1 && nums[j] % 2 == 0) { //nums[i]要係單數 nums[j]要係雙數, 乎合條件就會對調
      temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
      i++; //再拉近一格
      j--;
    } else if (nums[i] % 2 == 0) { //如果岩位置就會skip, 跳落下一格
      i++;
    } else if (nums[j] % 2 == 1) { //如果岩位置就會skip, 跳落上一格
      j--;
    }
    System.out.println("after:");
    System.out.print("[i]= " + i + " ");
    System.out.println("nums[i]= " + nums[i]);
    System.out.print("[j]= " + j + " ");
    System.out.println("nums[j]= " + nums[j]);
    System.out.println("temp =" + temp);
    System.out.println("end" + Arrays.toString(nums));
    System.out.println();

  }

  return Arrays.toString(nums);

}


  
}
