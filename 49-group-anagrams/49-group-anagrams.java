class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> ans = new HashMap<String,List<String>>();
        
        int[] ct = new int[26];
        
        for(String st: strs) {
            Arrays.fill(ct,0);
            char[] cc = st.toCharArray();
            
            for(Character c: cc) {
                
                ct[c - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder("");
            for(int i=0;i<26;i++) {
                sb.append('#');
                sb.append(ct[i]);
            }
            
            String key = sb.toString();
            if(!ans.containsKey(key)) {
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(st);
            
        }
        
        return new ArrayList(ans.values());
        
    }
}