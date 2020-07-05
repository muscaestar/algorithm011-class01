import java.util.*;

/**
 * Created by muscaestar on 7/5/20
 *
 * @author muscaestar
 */
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] sortedStr = str.toCharArray();
            Arrays.sort(sortedStr);
            String keyStr = new String(sortedStr);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
