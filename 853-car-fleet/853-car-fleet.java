class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
		TreeMap<Integer,Integer> pair = new TreeMap<>();
					List<Double> stack = new ArrayList<Double>();
						for(int i=0;i<position.length;i++){
									pair.put(position[i],speed[i]);
						}
    
					   for(Integer i:pair.descendingKeySet()){
							stack.add((Double.valueOf(target)-Double.valueOf(i))/Double.valueOf(pair.get(i)));
								if(stack.size()>=2 && stack.get(stack.size()-1)<=stack.get(stack.size()-2)){
									stack.remove(stack.size()-1);
						}
					}
        return stack.size();
        }
}