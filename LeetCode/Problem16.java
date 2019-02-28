class Problem16{
    public int threeSumClosest(int[] nums, int target) {
        long answer = Integer.MAX_VALUE;
        int length = nums.length;    
        Arrays.sort(nums);
        boolean found = false;
        for(int i=0;i<length-2;i++){
            int j=i+1;
            int z=length-1;
            if(found){
                break;
            }
        
            while(z>j){
                int number = nums[i]+nums[j]+nums[z];
                if(number==target){
                    found=true;
                    answer = number;
                    break;
                }
                if(Math.abs(number-target)<Math.abs(answer-target)){
                    answer = number;    
                }
                if(number-target>0){
                    z--;
                }
                if(number-target<0){
                    j++;
                }
                
            }
          
        }
        int x = Integer.parseInt(Long.toString(answer));
        return x;
        
     
        
    }
}