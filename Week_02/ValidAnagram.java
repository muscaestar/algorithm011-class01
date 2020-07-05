/**
 * Created by muscaestar on 7/5/20
 *
 * @author muscaestar
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] table = new int[26];
        for (char c : s.toCharArray()) {
            table[c - 97] += 1;
        }
        for (char c : t.toCharArray()) {
            table[c - 97] -= 1;
        }
        boolean result = true;
        for (int i : table) {
            if (i != 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
