class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<String> ss = new HashSet<String>();
        
        
        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                if(board[i][j] != '.' ) {
                    
                    if(ss.contains("row" + i + board[i][j]) || ss.contains("col" + j + board[i][j])) {
                        return false;
                    }
                    
                    ss.add("row" + i + board[i][j]);
                    ss.add("col" + j + board[i][j]);
                    
                    if(ss.contains("box" + (i/3) + (j/3) +  board[i][j])) {
                        return false;
                    }
                    
                    ss.add("box" + (i/3)  + (j/3) + board[i][j]);

                    
                }
            }
        }
        return true;
    }
}