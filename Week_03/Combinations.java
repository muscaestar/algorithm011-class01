import java.util.ArrayList;
import java.util.List;

/**
 * Created by muscaestar on 7/12/20
 *
 * @author muscaestar
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        helper(1, n, k, new ArrayList<>(), res);
        return res;
    }

    public void helper(int begin, int n, int k, List<Integer> temp, List<List<Integer>> listOflist) {
        if (temp.size() == k) {
            listOflist.add(new ArrayList<>(temp));
            return;
        }
        for (int i = begin; i <= n + 1 - (k - temp.size()); i++) {
            temp.add(i);
            helper(i + 1, n, k, temp, listOflist);
            temp.remove(temp.size() - 1);
        }
    }
}
