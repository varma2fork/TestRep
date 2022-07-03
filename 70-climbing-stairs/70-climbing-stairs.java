class Solution {
    public int climbStairs(int n) {
        
        int[] mem = new int[n+2];
        mem[0] = 1;
        mem[1] = 2;
        
        for(int i=2;i<n;i++) {
            mem[i] = mem[i-1] + mem[i-2];
        }
        
        return mem[n-1];
    }
}