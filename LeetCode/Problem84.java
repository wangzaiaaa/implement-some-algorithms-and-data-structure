class Problem84 {
    public int largestRectangleArea(int[] heights) {
        if(heights==null||heights.length<1) return 0;
        int max = 0;
        for(int i=0;i<heights.length;i++){
            int width = 1;
            for(int left= i-1;left>=0;left--){
                if(heights[i]<=heights[left]) width++;
                else break;
            }
            for(int right=i+1;right<heights.length;right++){
                if(heights[i]<=heights[right]) width++;
                else break;
            }
            if(width*heights[i]>max) max = width*heights[i];
        }
        return max;
    }
}