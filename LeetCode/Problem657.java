class Solution {
    public boolean judgeCircle(String moves) {
        if(moves==null||moves.length()<1) return true;
        int v=0,h=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U') v++;
            else if(moves.charAt(i)=='D') v--;
            else if(moves.charAt(i)=='L') h--;
            else h++;
        }
        return v==0&&h==0;
    }
}