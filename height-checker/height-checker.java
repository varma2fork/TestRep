class Solution {
    public int heightChecker(int[] heights) {
        
        int count = 0;
        int[] test = new int[heights.length];
      for(int i=0;i<heights.length;i++) {
          test[i] = heights[i]; 
      }
        
        Arrays.sort(test);
        
        for(int i=0;i<heights.length;i++) {
            if(heights[i] != test[i]) {
                count++;
            }
        }
        
        return count;
    }
}