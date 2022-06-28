class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean exists = false;
        
        HashMap<Integer,Integer> count = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            count.put(nums[i], count.getOrDefault(nums[i],0) + 1);
        }
        
        for(Integer n: count.values()) {
            
            if(n >= 2) {
               return true;
            }
        }
        
        return exists;
    }
}