/**
 * Created by muscaestar on 7/19/20
 *
 * @author muscaestar
 */
public class JumpGameII {
    public int jump(int[] nums) {
        if (nums.length == 1) return 0;
        int currTarget = 0;
        int nextTarget = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            nextTarget = Math.max(nextTarget, nums[i] + i);
            if (i == currTarget) {
                currTarget = nextTarget;
                cnt++;
                if (currTarget >= nums.length - 1) {
                    break;
                }
            }
        }
        return cnt;

    }
}
