class Solution {
    public void solve(char[][] board) {
        if(board==null||board.length<1||board[0].length<1){
            return;
        }else{
            for(int i=0;i<board.length;i++){
                solve(board,i,0);
                solve(board,i,board[0].length-1);
            }
            for(int i=0;i<board[0].length;i++){
                solve(board,0,i);
                solve(board,board.length-1,i);
            }
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]=='O'){
                        board[i][j] = 'X';
                    }
                    if(board[i][j]=='T'){
                        board[i][j] = 'O';
                    }
                }
            }
        }
    }
    public void solve(char[][] board,int i,int j){
        if(i<0||j<0||i>=board.length||j>=board[0].length||board[i][j]!='O'){
            return;
        }else{
            board[i][j] = 'T';
            solve(board,i-1,j);
            solve(board,i+1,j);
            solve(board,i,j-1);
            solve(board,i,j+1);
        }
    }
}