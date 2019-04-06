class Problem47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        if(nums==null||nums.length<1) return answer;
        Map<List<Integer>,Integer> mymap = new HashMap<>();
        addToList(0,mymap,nums);
        Set<List<Integer>> myset = mymap.keySet();
        for(List<Integer> li:myset){
            answer.add(li);
        }
        return answer;
    }
    public static void addToList(int i,Map<List<Integer>,Integer> mymap,int [] nums){
        if(i==nums.length-1){
            List<Integer> temp = new ArrayList<>();
            for(int n: nums){
                temp.add(n);
            }
            mymap.put(temp,1);
        }else{
            for(int j=i;j<nums.length;j++){
                swap(nums,i,j);
                addToList(i+1,mymap,nums);
                swap(nums,i,j);
            }
        }
        
    }
    public static void swap(int [] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}