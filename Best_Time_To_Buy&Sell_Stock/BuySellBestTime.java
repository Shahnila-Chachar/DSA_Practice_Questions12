class BuySellBestTime {
    public int maxProfit(int[] prices) {
        int profit=0;
        int maxProfit = 0;
        int sellPrice=0;
        

        for(int i=0; i<prices.length; i++){
            int buyPrice=prices[i];
            
            for(int j=i+1; j<prices.length; j++){
                if(prices[j]>buyPrice){
                    sellPrice=prices[j];
                    profit=sellPrice-buyPrice;
                }
                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
            
        }
        return maxProfit;
    }

    public static void main(String[] args){
        BuySellBestTime bsbt = new BuySellBestTime();
        int[] prices = {1, 2, 7, 3, 9};
        System.out.print(bsbt.maxProfit(prices) + " ");
    }
}