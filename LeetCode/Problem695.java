class Solution {
    private final int [][] dir = {{-1,0},{0,-1},{1,0},{0,1}}; 
    public int maxAreaOfIsland(int[][] grid) {
        if(grid==null||grid.length<1) return 0;
        int [][] board = new int [grid.length][grid[0].length];
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int temp = maxArea(grid,board,i,j);
                if(temp>ans) ans = temp;
            }
        }
        return ans;
    }
    int maxArea(int [][] grid,int [][] board,int x,int y){
        if(x<0||x>=grid.length||y<0||y>=board[0].length||grid[x][y]==0||board[x][y]==1){
            return 0;
        }else{
            board[x][y] = 1;
            int res = 1;
            for(int [] d:dir){
                res += maxArea(grid,board,x+d[0],y+d[1]);
            }
            return res;
        }
    }
}