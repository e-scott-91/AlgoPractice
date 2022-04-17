package arrays;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int currProfit = 0;

        for (int i=0; i< prices.length; i++){
            if (prices[i] < min){
                min = prices[i];
            } else {
                currProfit = Math.max(currProfit, prices[i]-min);
            }
        }
        return currProfit;
    }
}
