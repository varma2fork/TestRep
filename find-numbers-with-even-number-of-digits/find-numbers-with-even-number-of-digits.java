class Solution {
    public int findNumbers(int[] nums) {
        
        int tot = 0;
        
        for(int i=0;i<nums.length;i++) {
            
            String v = String.valueOf(nums[i]);
            int len = v.length();
            if(len%2 == 0) {
                tot++;
            }
        }
        
        return tot;
        
    }
}