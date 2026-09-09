class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int a =0;
        int b=1;
         while(b<prices.length){
            if(prices[b]>prices[a]){
                max = Math.max(max, prices[b]-prices[a]);
                b++;
            }else{
                a++;
                b =a+1;
            }
         }

         return max;
    }
}
