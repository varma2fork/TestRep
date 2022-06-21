class Solution {
    public boolean isValid(String s) {
        Stack<Character> sk = new Stack<>();
        HashMap<Character, Character> mm = new HashMap<Character, Character>();
        mm.put(']','[');
        mm.put(')','(');
        mm.put('}','{');
        for(int i=0;i<s.length();i++) {
            if(mm.containsKey(s.charAt(i))) {
            if(!sk.isEmpty() && sk.lastElement() == mm.get(s.charAt(i))) {
                sk.pop();
            }
            else {
                return false;
            }
            } else {
                sk.add(s.charAt(i));
            }
        }
        return sk.isEmpty();
    }
}