 fun maxProfit(prices: IntArray): Int {
            var totalProfit = 0
            var minPrice = prices[0]
            for (i in 1 until prices.size - 1) {
                if (minPrice > prices[i]) {
                    minPrice = prices[i]
                } else if (prices[i] > prices[i + 1]) {
                    totalProfit += prices[i] - minPrice
                    minPrice = Int.MAX_VALUE
                }
            }
            if (minPrice != Int.MAX_VALUE && prices[prices.size - 1] > minPrice) {
                totalProfit += prices[prices.size - 1] - minPrice
            }
            return totalProfit
        }
