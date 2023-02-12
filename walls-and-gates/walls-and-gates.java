class Solution {
    
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final int GATE = 0;
     private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[] { 1,  0},
        new int[] {-1,  0},
        new int[] { 0,  1},
        new int[] { 0, -1}
);


    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> qu = new LinkedList<>();
         int k = rooms.length;
        int l = rooms[0].length;
        for(int i=0;i<rooms.length;i++) {
            for(int j=0;j<rooms[0].length;j++) {
                if(rooms[i][j] == GATE) {
                    qu.add(new int[]{i,j} );
                }
            }
        }
        
        while(!qu.isEmpty()) {
            int[] tmp = qu.poll();
            int row = tmp[0];
            int col = tmp[1];
            
            for(int[] t: DIRECTIONS) {
                int rd = row + t[0];
                int cd = col + t[1];
                
                if(rd<0 || cd < 0 || rd>=k || cd>=l || rooms[rd][cd] != EMPTY) {
                    continue;
                }
                rooms[rd][cd] = rooms[row][col] + 1;
                qu.add(new int[]{rd,cd});
            }
        } 
    }
}