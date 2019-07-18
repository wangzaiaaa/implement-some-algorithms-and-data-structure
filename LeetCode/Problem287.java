class Solution {
    public int findDuplicate(int[] nums) {
        int l = 1,r = nums.length - 1;
        while(l<=r){
            if(l==r) return l;
            int mid = l + ((r-l)>>1);
            int count = numsInIntervl(nums,l,mid);
            if(count>mid-l+1){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return -1;
    }
    private int numsInIntervl(int [] nums,int low,int high){
        int res = 0;
        for(int num : nums){
            if(num>=low&&num<=high) res++;
        }
        return res;
    }
}