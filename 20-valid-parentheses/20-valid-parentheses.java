class Solution {
    public boolean isValid(String s) {
            Stack<Character> sk = new Stack<>();
        for(int i=0;i< s.length();i++) {
            Character l = s.charAt(i);

            if(l == '{' || l == '[' || l == '(') {
                sk.push(l);
            } else {
                if(sk.isEmpty()) {
                    return false;
                } else {
                    char t = sk.peek();
                    if(t == '{' && l == '}' || t == '[' && l == ']' || t == '(' &&  l == ')') {
                        sk.pop();
                    } else {
                        return false;
                    }

                }
            }

        }
        if(sk.isEmpty()) {
            return true;
        } else return false;
        
    }
}