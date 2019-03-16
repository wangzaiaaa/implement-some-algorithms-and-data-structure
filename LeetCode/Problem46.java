class Problem46 {
    List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        
        permute(0,nums);
        return answer;
    }
    public void permute(int i,int [] nums){
        if(i==nums.length-1){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int num: nums){
                temp.add(num);
            }
            answer.add(temp);
        }else{
            for(int j=i;j<nums.length;j++){
                swap(nums,i,j);
                permute(i+1,nums);
                swap(nums,i,j);
            }
        }
        
    }
    public void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}