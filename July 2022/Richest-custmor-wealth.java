class Solution {
    public int maximumWealth(int[][] accounts) {
     int max=0,sum=0;
        
        for(int i=0; i<accounts.length; i++)
        {
            sum=0;
            for(int j=0; j<accounts[i].length; j++)
            {
                sum+=accounts[i][j];
            }
            if(i==0)
            {
                max=sum;
            }
            if(max<sum)
            {
                max=sum;
            }
        }
        return max;
  }
}