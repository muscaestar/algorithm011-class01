import java.util.HashMap;

/**
 * Created by muscaestar on 7/5/20
 *
 * @author muscaestar
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int pal = target - nums[i];
            if (map.containsKey(pal)) {
                return new int[]{i, map.get(pal)};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
