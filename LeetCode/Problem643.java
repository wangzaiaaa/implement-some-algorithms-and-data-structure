class Problem643 {
    public double findMaxAverage(int[] nums, int k) {
        
        if(nums==null||nums.length<1||nums.length<k) return (double)0;
        double answer = Integer.MIN_VALUE;
        double sum = 0;
        for(int i=0;i<k;i++){
            sum += nums[i];
        }
        answer = sum/k;
        for(int i=1;i+k-1<nums.length;i++){
            sum = sum - nums[i-1] + nums[i+k-1];
            if(sum/k>answer) answer = sum/k;
        }
        return answer;
        
    }
}