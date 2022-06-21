class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> ch = new Stack<Integer>();
        for(int i=0;i<tokens.length;i++) {
            if(tokens[i].equals("+")) {
                ch.add(ch.pop() + ch.pop());
            } else if(tokens[i].equals("-")) {
                int a = ch.pop();
                int b = ch.pop();
                ch.add(b-a);
            } else if(tokens[i].equals("*")) {
                ch.add(ch.pop() * ch.pop());
            } else if(tokens[i].equals("/")) {
                 int a = ch.pop();
                int b = ch.pop();
                ch.add(b/a);
            } else {
                ch.add(Integer.valueOf(tokens[i]));
            }
        }
        
        return ch.lastElement();
        
    }
}