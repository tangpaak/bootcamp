public class leetV485 {


    public int findMaxConsecutiveOnes(int[] nums) {
        //
        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                continue;
            } else {

                // i係最後位置都要比較個max
                if (count > max) {
                    max = count;
                }
                count = 0; // reset the count
            }

        }
        if (count > max) {
            max = count;
        }

        return max;



    }



}
