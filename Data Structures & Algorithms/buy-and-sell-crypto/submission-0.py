class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min = prices[0]
        max_profit =0
        for i in range(0,len(prices)):
            if(prices[i]<min):
                min = prices[i]
            max_profit =max((prices[i]-min),max_profit)
        return max_profit
        