class Solution {
    public boolean canMeasureWater(int x, int y, int z) {
        if(z == 0) return true;
        if(x + y < z) return false;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return z==0 || z % x == 0;
    }
}