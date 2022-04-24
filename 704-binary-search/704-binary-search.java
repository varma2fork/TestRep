class Solution {
    public int search(int[] nums, int target) {
        int l = 0; int r = nums.length - 1;
  while(l<=r){
              int pivot = (l+r)/2;
      if(nums[pivot] == target) {
          return pivot;
      }
      if(nums[pivot]>target) {
          r = pivot -1;
      } else {
          l = pivot +1;
      }
  }
        return -1;
    }
}