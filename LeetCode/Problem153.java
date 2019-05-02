class Solution {
    public int findMin(int[] nums) {
        if(nums==null||nums.length<1) return 0;
        int index1 = 0,index2 = nums.length-1,midindex=0;
        while(nums[index1]>=nums[index2]){
            if(index2==index1+1){
                midindex = index2;
                break;
            }
            midindex = index1 + ((index2-index1)>>1);
            if(nums[midindex]==nums[index1]&&nums[midindex]==nums[index2]) return findMin(nums,index1,index2);
            if(nums[midindex]>=nums[index1]) index1 = midindex;
            else if(nums[midindex]<=nums[index2]) index2 = midindex;
        }
        return nums[midindex];
    }
    public int findMin(int [] nums,int start,int end){
        if(nums==null||start<0||end>=nums.length) return 0;
        int min = nums[start];
        for(int i=start+1;i<=end;i++){
            if(nums[i]<min) min = nums[i];
        }
        return min;
    }
}