class Problem229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        if(nums==null||nums.length<1)return answer;
        Arrays.sort(nums);
        int j=1;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length&&nums[i]==nums[i+1])j++;
            else{
                if(j>(int)(nums.length/3)) answer.add(nums[i]);
                j=1;
            }
        }
        return answer;
    }
}