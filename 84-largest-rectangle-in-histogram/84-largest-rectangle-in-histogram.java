class Solution {
    public int largestRectangleArea(int[] heights) {
        Integer maxValue = 0;
        Stack<Integer> ll = new Stack<Integer>();
        ll.push(-1);
        for(int i=0;i<heights.length;i++) {
            while(ll.peek() != -1 && (heights[ll.peek()] >= heights[i])) {
                int height = heights[ll.pop()];
                int width = i - ll.peek() - 1;
                maxValue = Math.max(maxValue, width * height);
            }
            ll.push(i);
        }
        
        while(ll.peek() != -1) {
            int height = heights[ll.pop()];
            int width = heights.length - ll.peek() -1;
            maxValue = Math.max(maxValue, height * width);
        }
        return maxValue;
    }
}