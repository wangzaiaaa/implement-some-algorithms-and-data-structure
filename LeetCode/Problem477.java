class Problem477 {
    public int totalHammingDistance(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        int answer = 0,count=0;
        for(int i=0;i<32;i++){
            count = 0;
            for(int num:nums){
                count+=(num>>i)&1;
            }
            answer += count * (nums.length-count);
        }
        return answer;
    }
     
}