class Solution {
    public int[] runningSum(int[] nums) {
    int n = nums.length;
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i] = sum(i,nums);
    }
 return arr;
 } 
    
 public int sum(int n,int nums[])
{
    int Sum=0;
    for(int i=0;i<=n;i++)
    {
        Sum+=nums[i];
    }
    return Sum;
}
}

