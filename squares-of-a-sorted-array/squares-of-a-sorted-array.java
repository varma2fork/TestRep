class Solution {
    public int[] sortedSquares(int[] nums) {
        
        for(int i=0;i<nums.length;i++) {
            
            nums[i] = nums[i] * nums[i];
        }
        
       // Arrays.sort(nums);
        
        int left =0;
        int right = nums.length-1;
        int[] rep = new int[nums.length];
        
        for(int i=nums.length-1;i>=0;i--) {
            if(nums[left] > nums[right]) {
                rep[i] = nums[left];
                left++;
            } else {
                rep[i] = nums[right];
                right--;
            }
        }
        
        return rep;
        
    }
}