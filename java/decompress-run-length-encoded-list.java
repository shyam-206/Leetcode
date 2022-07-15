class Solution {
    public int[] decompressRLElist(int[] nums) {
    
    //for cal. how many length of element is repeat for that 
    int arrayLength = 0;
    for(int i = 0; i < nums.length; i = i+2){
    arrayLength = arrayLength + nums[i];
    }

    int Array[] = new int[arrayLength];
    int counter = 0;
    for(int i = 0; i < nums.length - 1; i = i+2){
        for(int j = 0; j < nums[i]; j++)  {
            Array[counter+j] = nums[i+1];
        }
        counter = counter+nums[i];
     }
    return Array;

  }    
}
