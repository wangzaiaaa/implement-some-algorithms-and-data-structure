class Problem162 {
    public int findPeakElement(int[] nums) {
        if(nums.length==1) return 0;
        if(nums==null||nums.length<1) return -1;
        return findPeakElement(nums,0,nums.length-1);
    }
    public int findPeakElement(int [] nums,int i,int j){
        if(i>j) return -1;
        int mid = i + ((j-i)>>1);
        if(mid==0){
            if(nums[0]>nums[1]) return 0;
            else return findPeakElement(nums,mid+1,j);
        }
        else if(mid==nums.length-1){
            if(nums[mid]>nums[mid-1]) return mid;
            else return findPeakElement(nums,i,mid-1);
        } 
        else if(nums[mid]>nums[mid-1]&&nums[mid]>nums[mid+1]) return mid;
        int ans = findPeakElement(nums,i,mid-1);
        return ans>=0 ? ans : findPeakElement(nums,mid+1,j);
    }
}