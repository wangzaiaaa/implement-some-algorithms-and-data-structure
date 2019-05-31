class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums==null||nums.length<1||k<0||k>nums.length) return -1;
        int start = 0,end = nums.length-1;
        int index = patition(nums,start,end);
        int target = nums.length - k;
        while(index!=target){
            if(index>target){
                end = index - 1;
                index = patition(nums,start,end);
            }else{
                start = index + 1;
                index = patition(nums,start,end);
            }
        }
        return nums[index];
    }
    public int patition(int [] array,int lo,int hi){
        int i = lo,j = hi + 1,v = array[lo];
        while(true){
            while(i!=hi&&less(array[++i],v));
            while(j!=lo&&less(v,array[--j]));
            if(i>=j) break;
            swap(array,i,j);
        }
        swap(array,lo,j);
        return j;
    }
    public void swap(int [] array,int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        
    }
    boolean less(int i,int j){
        return i < j ? true : false;
    }
}