class Solution {
    int [][] path = {{-1,0},   //вС
                     {0,1},   //ио
                     {1,0},    //ср
                     {0,-1}};   //об
    public boolean isRobotBounded(String instructions) {
        if(instructions==null||instructions.length()<1) return true;
        int x = 0,y = 0,direction = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<4;i++){
            sb.append(instructions);
        }
        for(int i=0;i<sb.length();i++){
            char c= sb.charAt(i);
            if(c=='G'){
                x += path[direction][0];
                y += path[direction][1];
            }else if(c=='L'){
                direction = (direction + 4 -1) % 4;
            }else{
                direction = (direction + 1) % 4;
            }
        }
        return (x==0 && y==0);
        
    }
}