class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        int profit=0;
        for(int i=0;i<prices.length;i++){
            int current_price=prices[i];
            if(current_price<minPrice){
                minPrice=current_price;
            }
            else{
                profit=current_price-minPrice;

                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
        }
        return maxProfit;
    }
}