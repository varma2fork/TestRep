class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int i=0;
        int j=nums.length-1;
        
        for(int k=0;k<nums.length;k++) {
            
            if(nums[k]%2 == 0) {
                int tmp = nums[i];
                nums[i] = nums[k];
                nums[k] = tmp;
                i++;
            } 
        }
        
        return nums;
        
    }
}