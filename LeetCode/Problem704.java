class Problem704 {
    public int search(int[] nums, int target) {
        if(nums==null||nums.length<1) return 0;
        int i = 0,j= nums.length-1;
        int mid = 0;
        while(i<=j){
            mid = (int)((i+j)/2);
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) j = mid -1;
            else{
                i = mid + 1;
            }
        }
        return -1;
    }
}