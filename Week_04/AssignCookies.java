import java.util.Arrays;

/**
 * Created by muscaestar on 7/19/20
 *
 * @author muscaestar
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int pG = 0;
        int pS = 0;
        int cnt = 0;
        while (pG < g.length && pS < s.length) {
            if (g[pG] <= s[pS]) {
                pG++;
                pS++;
                cnt++;
            } else {
                pS++;
            }
        }
        return cnt;

    }
}
