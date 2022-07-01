class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> count = new HashMap<>();
        
        for(int i=0;i<nums.length;i++) {
            
            if(count.containsKey(nums[i])) {
                count.put(nums[i], count.get(nums[i]) + 1);
            } else {
                count.put(nums[i],1);
            }
               
               }
Map<Integer, Integer> result = count.entrySet()
  .stream()
  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
  .limit(k)
  .collect(Collectors.toMap(
    Map.Entry::getKey, 
    Map.Entry::getValue, 
    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        
        List<Integer> dd = new ArrayList<>();

        
    for(Integer l:result.keySet()) {
        dd.add(l);
    } 
        
        int[] example2 = dd.stream().mapToInt(Integer::intValue).toArray();
        
        return  example2;
               }
               }