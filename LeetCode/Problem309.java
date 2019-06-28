class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<2) return 0;
        int buy = -prices[0],sell = 0,cool = 0;
        for(int i=1;i<prices.length;i++){
            int temp = buy;
            buy = Math.max(buy,cool-prices[i]);
            cool = sell;
            sell = Math.max(sell,temp+prices[i]);
        }
        return sell;
    }
}