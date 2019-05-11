class Solution {
    public boolean exist(char[][] board, String word) {
        if(board==null||word==null||board.length<1) return false;
        int [][] visited = new int[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(exist(board,word,0,visited,i,j)) return true;
            }
        }
        return false;
    }
    public boolean exist(char[][] board,String word,int path,int [][] visited,int x,int y){
        if(x<0||x>=board.length||y<0||y>=board[0].length) return false;
        if(path==word.length()-1&&word.charAt(path)==board[x][y]&&visited[x][y]!=1) return true;
        boolean hasPath = false;
        if(visited[x][y]==0&&word.charAt(path)==board[x][y]){
            visited[x][y] = 1;
            hasPath =  exist(board,word,path+1,visited,x-1,y)||
                       exist(board,word,path+1,visited,x+1,y)||
                       exist(board,word,path+1,visited,x,y-1)||
                       exist(board,word,path+1,visited,x,y+1);
            if(!hasPath){
                visited[x][y] = 0;
                path--;
           }
        }
      
        return hasPath;
    }
}