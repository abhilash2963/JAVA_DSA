public class BuyAndSellStocks {
    public static int[] buyAndSellStocks(int prices[]) {
        int buyingPrice = Integer.MAX_VALUE;
        int buyDay = 0, sellDay = 0;
        int maxProfit = 0, tempBuyDay = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyingPrice < prices[i]) {
                int profit = prices[i] - buyingPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                    buyDay = tempBuyDay;
                    sellDay = i;
                }
            } else {
                buyingPrice = prices[i];
                tempBuyDay = i;  // update potential buying day
            }
        }

        return new int[]{maxProfit, buyDay, sellDay};
    }

    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int result[] = buyAndSellStocks(prices);

        System.out.println("Max Profit: " + result[0]);
        System.out.println("Buy on day: " + result[1]);
        System.out.println("Sell on day: " + result[2]);
    }
}
