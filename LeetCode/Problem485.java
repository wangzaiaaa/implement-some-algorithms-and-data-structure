class Problem485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        int start = 0,maxlength=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                start++;
            }else{
                if(start>maxlength) maxlength = start;
                start = 0;
            }
                
        }
        return Math.max(start,maxlength);
    }
}