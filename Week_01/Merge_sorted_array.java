/**
 * Created by muscaestar on 6/28/20
 *
 * @author muscaestar
 */
public class Merge_sorted_array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int end = m + n - 1;
        int p1 = m - 1;
        int p2 = n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[end--] = nums1[p1--];
            } else {
                nums1[end--] = nums2[p2--];
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }
}
