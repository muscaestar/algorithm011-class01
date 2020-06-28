/**
 * Created by muscaestar on 6/28/20
 *
 * @author muscaestar
 */
public class Rotate_array {
    public void rotate(int[] arr, int k) {
        int len = arr.length;
        int[] newArr = new int[len];
        for (int i = 0; i < len; i++) {
            int nextIndex = (i + k) % len;
            newArr[nextIndex] = arr[i];
        }
        System.arraycopy(newArr, 0, arr, 0, len);
    }
}
