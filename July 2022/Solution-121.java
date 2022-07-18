class Solution {
    public int maxProfit(int[] prices) {
        int j=1;
        int i=0;
        int temp;
        int maxProfit=0;
         while(j<prices.length){
             if(prices[j]>prices[i]){
                temp=prices[j]-prices[i];
                maxProfit=Math.max(maxProfit,temp);
                 j++;
             }
             else{
                 i=j;
                 j++;
             }
             
         }
        return maxProfit;
    }
}