class Solution {
    public int lengthOfLongestSubstring(String str) {
int l=0;
        int maxl = 0;
        HashSet<Character> ss = new HashSet<>();
        for(int r = 0; r < str.length(); r++) {
            while(ss.contains(str.charAt(r))) {
                ss.remove(str.charAt(l));
                l = l + 1;
            }
            ss.add(str.charAt(r));
            maxl = Math.max(maxl, r-l+1);
        }
        return maxl;
    }
}