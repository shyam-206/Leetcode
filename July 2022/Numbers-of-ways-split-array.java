
//gives tle
/* 
class Solution {
    public int waysToSplitArray(int[] nums) {
    int count = 0;
        
    for(int i = 0;i<nums.length-1;i++){
        int left_sum = 0, right_sum = 0;
        
        for(int j=0;j<=i;j++){
            left_sum += nums[j];
        }
        for(int j=i+1;j<nums.length;j++){
            right_sum += nums[j];
        }
        
        if(left_sum >= right_sum)
            count++;
    }
        return count;
   
    }
}
*/

//second approach find the sum of array and the checking
//in loop from(i,nums.length-1) in that first sum the temp 
//and then check the temp >= sum - temp -> count+=1

class Solution {
    public int waysToSplitArray(int[] nums) {
        
        long sum=0;
        
        long temp=0;
        
        int count=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        
        for(int i=0;i<nums.length-1;i++){
            temp+=nums[i];
            
            if(temp>=sum-temp){
                count++;
            }
            
        }
        
        return count;
    }
}