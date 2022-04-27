class Solution {
    public int[] sortedSquares(int[] nums) {
                for(int i=0;i< nums.length;i++) {

            nums[i] = (int) Math.pow(nums[i], 2);
        }
        int[] result = new int[nums.length];
        int l = 0;
        int r = nums.length -1;
            int nu;
        for(int i=nums.length -1;i>=0;i--) {
            
            if(nums[l] < nums[r]) {
                nu = nums[r];
                r--;
            } else {
                nu = nums[l];
                l++;
            }
            
            result[i] = nu;
            
        }

        return result;
    }
        
}