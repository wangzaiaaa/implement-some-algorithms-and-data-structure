class Solution {
       int x[] = {-1, -1, -1, 0, 1, 1, 1, 0};
       int y[] = {-1, 0, 1, 1, 1, 0, -1, -1};
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid == null || grid.length < 1 || grid[0][0] == 1 || grid[grid.length-1][grid[0].length-1] == 1) return -1;    
        return bfs(grid);
    }
    int bfs(int [][] grid){
        int rowSize = grid.length, colSize = grid[0].length;
        boolean [][] visited = new boolean [rowSize][colSize];
        Node start = new Node(0,0,1);
        Queue<Node> queue = new LinkedList<>();
        queue.offer(start);
        Node temp = null;
        while(!queue.isEmpty()){
            temp = queue.poll();
            if(temp.x == rowSize-1 && temp.y == colSize -1){
                return temp.val;
            }
            for(int i=0;i<x.length;i++){
                int row = temp.x + x[i];
                int col = temp.y + y[i];
                if(row>=0 && col>=0 && row<rowSize && col<colSize && grid[row][col]==0 && !visited[row][col]){
                    queue.offer(new Node(row,col,temp.val+1));
                    visited[row][col] = true;
                }
            }
        }
        return -1;
    }
      
}
/**
x,y 表示坐标
val 表示到达该点的距离
**/
class Node{
    int x,y,val;
    Node(int x,int y,int val){
        this.x = x;
        this.y = y;
        this.val = val;
    }
}