class Problem605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed==null||flowerbed.length<n) return false;
        if(flowerbed.length==1&&n==1&&flowerbed[0]==0) return true;
        if(flowerbed.length>1&&flowerbed[0]==0&&flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
        int length = flowerbed.length-1;
        for(int i=1;i<length;i++){
            if(flowerbed[i]==0&&flowerbed[i-1]==0&&flowerbed[i+1]==0){
                n--;
                flowerbed[i]=1;
            }
        }
        if(flowerbed.length>1&&flowerbed[length]==0&&flowerbed[length-1]==0)n--;
        return n<=0;
    }
}