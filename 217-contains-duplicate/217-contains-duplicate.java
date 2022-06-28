class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean exists = false;
        
        HashMap<Integer,Integer> count = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            if(count.containsKey(nums[i])) {
                return true;
            }
            count.put(nums[i], count.getOrDefault(nums[i],0) + 1);
        }
        
        return exists;
    }
}