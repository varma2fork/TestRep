class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int i =0;
        int j= numbers.length -1;
        
        while(i< j) {
            
            if((numbers[i] + numbers[j]) == target) {
                break;
            }
            
            if((numbers[i] + numbers[j]) < target) {
                i++;
            } else {
                j--;
            }
            
        }
        
        System.out.println(i);
            System.out.println(j);
        
        return new int[]{i+1,j+1};
        
    }
}