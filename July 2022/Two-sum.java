class Solution {
    public int[] twoSum(int[] nums, int target) {
        
      int indices[] = new int[2];

		for(int i=0; i<nums.length; i++) {
		  	int current = nums[i];
			for (int j=i+1; j<nums.length; j++) {
				if (current + nums[j] == target) {
					indices[0]=i;
					indices[1]=j;
				}
			}
		}

		return indices;
    }
}
/*
in cpp solution

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
     for(int i=0; i<nums.size();i++)
     {
         for(int j=i+1;j<nums.size();j++)
         { 
             if(nums[i]+nums[j]== target)
                 return {i,j} ;
         }  
     }
    return {};
    }
};

 */