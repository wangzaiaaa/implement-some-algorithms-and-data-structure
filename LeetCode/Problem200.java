class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length<1||grid[0].length<1)return 0;
        int res = 0;
        int [][] visited = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                res += numIslands(grid,visited,i,j);
            }
        }
        return res;
    }
    public int numIslands(char [][] grid,int [][] visited,int r,int c){
        if(r<0||r>=grid.length||c<0||c>=grid[0].length||visited[r][c]==1||grid[r][c]=='0'){
            return 0;
        }else{
            visited[r][c] = 1;
            numIslands(grid,visited,r-1,c);
            numIslands(grid,visited,r+1,c);
            numIslands(grid,visited,r,c-1);
            numIslands(grid,visited,r,c+1);
            return 1;
        }
    }
}