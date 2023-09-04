import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class leetcode2465no {
  public static int distinctAverages(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    List<Double> list = new LinkedList<>();

    for (int i = 0; i < n ; i ++){
      list.add((double) nums[i]);
    }

    double min = list.get(0);
    double max = list.get(list.size() - 1);


    double result = (min + max)/2 ;
    return (int)result;
  }



  public static void main(String[] args) {

    int [] nums = new int []{4,1,4,0,3,5};
    System.out.println(distinctAverages(nums));

  }


}
