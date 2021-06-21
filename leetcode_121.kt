class Solution {
    fun maxProfit(prices: IntArray): Int {
            var maxProfit = 0
            val length = prices.size
            var minBuy = prices[0]
            for(i in 1 until length){
                val profit = prices[i]-minBuy
                if(profit>maxProfit){
                    maxProfit = profit
                }
                if(prices[i]<minBuy){
                    minBuy = prices[i]
                }
            }
            return maxProfit
        }
}
