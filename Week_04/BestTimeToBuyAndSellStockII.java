/**
 * Created by muscaestar on 7/19/20
 *
 * @author muscaestar
 */
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int prevPrice = prices[0];
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prevPrice) {
                res += prices[i] - prevPrice;
            }
            prevPrice = prices[i];
        }
        return res;

    }
}
