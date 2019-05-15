class Solution {
    public boolean canPartition(int[] nums) {
        if(nums==null||nums.length<1) return false;
        int sum = 0;
        for(int i:nums){
            sum += i;
        }
        if(sum%2!=0) return false;
        int target = sum / 2;
        boolean [] dp = new boolean[target+1];
        for(int i=0;i<nums.length;i++){
            for(int j=target;j>=nums[i];j--){
                if(i==0) dp[j] = (nums[i]==j);
                else dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return dp[target];
        
    }
    //»ØËÝ³¬Ê±ÁË
    public boolean canFind(int [] array,int layel,int target,int cur){
        if(layel>array.length-1){
            return false;
        }else{
            if(cur + array[layel] < target){
                cur += array[layel];
                layel++;
                return canFind(array,layel,target,cur)||canFind(array,layel,target,cur-array[layel-1]);
            }else if(cur + array[layel] == target){
                return true;
            }else{
                return canFind(array,layel+1,target,cur);
            }
        }

    }
}