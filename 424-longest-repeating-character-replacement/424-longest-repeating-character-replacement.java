class Solution {
    public int characterReplacement(String s, int k) {
        
        int l =0;
        int maxl = 0;
        int res = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for(int r =0;r<s.length();r++) {
            mp.put(s.charAt(r),mp.getOrDefault(s.charAt(r),0) + 1);
            maxl = Math.max(maxl,mp.get(s.charAt(r)));
                            while((r-l+1) - maxl > k ) {
                                mp.put(s.charAt(l),mp.get(s.charAt(l)) - 1);
                                l = l+ 1;
                            }
                            
             res = Math.max(res, r-l+1);               
        }
                            
        return res;
        
    }
}