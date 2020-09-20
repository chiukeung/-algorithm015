package leetcode;

public class Solution122 {
	public int maxProfit(int[] prices) {
        int bottom = prices[0], top = prices[0];
        int i = 0, max = 0;
        while ( i < prices.length - 1 ) {
            while ( i < prices.length - 1 && prices[i] >= prices[i + 1] )
                i++;
            bottom = prices[i];
            while ( i < prices.length - 1 && prices[i] <= prices[i + 1] )
                i++;
            top = prices[i];
            max += top - bottom;
        }
        return max;
    }
}
