class Solution {
    public int findNumbers(int[] nums) {
        
        int tot = 0;
        
        for(int i=0;i<nums.length;i++) {
            
            int count = 0;
            int l = nums[i];
            
            while(l > 0) {
             l = l/10;
             count++;
            }
            
            if(count%2 == 0) {
                tot++;
            }
        }
        
        return tot;
        
    }
}