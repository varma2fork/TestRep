class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character,Integer> cc = new HashMap<Character, Integer>();
        HashMap<Character,Integer> ct = new HashMap<Character, Integer>();
        
    for(int i=0;i<s.length();i++) {
        cc.put(s.charAt(i),cc.getOrDefault(s.charAt(i),0) + 1);
    }
        
    for(int i=0;i<t.length();i++) {
        ct.put(t.charAt(i),ct.getOrDefault(t.charAt(i),0) + 1);
    }
        
        for(Character c: cc.keySet()) {
               System.out.println("char" + ":" + c + "ccval" + ":" + cc.get(c) + "ctval" + ":" + ct.get(c));
    if(ct.containsKey(c)) {
    if (!cc.get(c).equals(ct.get(c))) {
     
            return false;
    } } else {
        return false;
    }
        }
        
        
                for(Character c: ct.keySet()) {
               System.out.println("char" + ":" + c + "ccval" + ":" + cc.get(c) + "ctval" + ":" + ct.get(c));
    if(cc.containsKey(c)) {                
    if (!cc.get(c).equals(ct.get(c))) {
     
            return false;
    } 
    }else {
        return false;
    }
                }
        
        return true;
    }
}