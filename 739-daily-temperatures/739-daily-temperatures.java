class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
       Stack<Integer> temp = new Stack<>();
        int res[] = new int[temperatures.length];
       for(int i=0;i<temperatures.length;i++) {
           while(!temp.isEmpty() && temperatures[i] > temperatures[temp.lastElement()]) {
               int val = temp.pop();
               res[val] = i - val;
           }
           temp.push(i);
       }
        
        return res;
        
    }
}