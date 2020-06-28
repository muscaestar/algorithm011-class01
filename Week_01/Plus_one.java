/**
 * Created by muscaestar on 6/28/20
 *
 * @author muscaestar
 */
public class Plus_one {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = 1; i < len + 1; i++) {
            if (digits[len - i] == 9) {
                digits[len - i] = 0;
                if (i == len) {
                    int[] newArr = new int[len + 1];
                    newArr[0] = 1;
                    System.arraycopy(digits, 0, newArr, 1, len);
                    digits = newArr;
                    break;
                }
            } else {
                digits[len - i]++;
                break;
            }
        }
        return digits;
    }
}
