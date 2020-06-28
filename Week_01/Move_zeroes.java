/**
 * Created by muscaestar on 6/28/20
 *
 * @author muscaestar
 */
public class Move_zeroes {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                count++;
            } else if (count > 0) {
                nums[i-count] = nums[i];
            }
        }
        for (int j = 1; j < count + 1; j++) {
            nums[len - j] = 0;
        }
    }
}
