class Solution {
    public int[] numberOfPairs(int[] nums) {
    
    Arrays.sort(nums);
        
    int count = 0;
    for(int i=0;i<nums.length;i++){
        if(i>0 &&  nums[i] == nums[i-1]){
            nums[i] = -1;
            nums[i-1] = -1;
            count++;
        }
    }
        
    int[] arr = new int[2];
    arr[0] = count;
    arr[1] = nums.length -(2*count);
    
    return arr;
    }
}