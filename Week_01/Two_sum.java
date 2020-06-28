import java.util.HashMap;
import java.util.Map;

/**
 * Created by muscaestar on 6/28/20
 *
 * @author muscaestar
 */
public class Two_sum {
    public int[] twoSum(int[] nums, int target) {
        //<value, index>
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int another = target - nums[i];
            if (map.containsKey(another) && map.get(another) != i){
                return new int[] {i, map.get(another)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution.");
    }
}
