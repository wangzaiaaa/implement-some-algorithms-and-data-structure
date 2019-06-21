class Solution {
    public void gameOfLife(int[][] board) {
        /**
        活细胞死亡 1-2
        死细胞复活 0 - -1
        **/
        if(board==null||board.length<1) return;
        change(board);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==2){
                    board[i][j] = 0;
                }
                if(board[i][j]==-1){
                    board[i][j] = 1;
                }
            }
        }
        
    }
    public void change(int [][] board){
        int row = board.length,col = board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int count = 0;     //周围活细胞的数量
                for(int p=i-1;p<=i+1;p++){
                    for(int q=j-1;q<=j+1;q++){
                       if(p>=0&&p<row&&q>=0&&q<col){
                            if(p==i&&q==j) continue;     
                            if(board[p][q]>=1) count++;
                        }
                    }
                }
                //如果当前位置的细胞是活细胞
                if(board[i][j]==1){
                    if(count<2||count>3) board[i][j] = 2;
                }
                //如果当前位置的细胞是死细胞
                else{
                    if(count==3) board[i][j] = -1;
                }
            }
        }
    }
}