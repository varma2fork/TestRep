class Solution {
       List<String> paran = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
     
        backTrack(0,0,"",n);
        
        return paran;
        
        
    }
    
    public void backTrack(int start, int end, String s,int n) {
        
        if(start == end && start == n && end == n) {
            paran.add(s);
            return;
        }
        
        if(start < n) {
            backTrack(start+1, end,s+"(",n);
        }
        
          
        if(end < start) {
            backTrack(start, end + 1,s+")",n);
        }
        
        
    }
}