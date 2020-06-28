/**
 * Created by muscaestar on 6/28/20
 *
 * @author muscaestar
 */
public class Remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return ++i;
    }
}
