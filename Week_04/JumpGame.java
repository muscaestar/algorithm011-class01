/**
 * Created by muscaestar on 7/19/20
 *
 * @author muscaestar
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        // if (nums.length == 1) {
        //     return true;
        // }
        int farestIdx = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            if (i > farestIdx) return false;
            farestIdx = Math.max(farestIdx, nums[i] + i);

            if (farestIdx >= nums.length - 1) {
                return true;
            }

        }
        return nums.length == 1;

    }
}
