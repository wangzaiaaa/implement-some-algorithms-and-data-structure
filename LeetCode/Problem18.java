class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums==null||nums.length<4){
            return res;
        }else{
            Arrays.sort(nums);
            int n = nums.length;
            for(int i=0;i<n-3;i++){
                if(i>0&&nums[i]==nums[i-1])continue;
                if(nums[i]+nums[i+1]+nums[i+2]+nums[i+3]>target) break;
                if(nums[i]+nums[n-1]+nums[n-2]+nums[n-3]<target) continue;
                for(int j=i+1;j<n-2;j++){
                    if(j>i+1&&nums[j]==nums[j-1]) continue;
                    if(nums[i]+nums[j]+nums[n-1]+nums[n-2]<target)continue;
                    if(nums[i]+nums[j]+nums[j+1]+nums[j+2]>target)break;
                    int left = j + 1;
                    int right = n - 1;
                    while (left<right){
                        if(nums[i]+nums[j]+nums[left]+nums[right]==target){
                            List<Integer> temp = new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                            res.add(temp);
                            while (left<right&&nums[left]==nums[left+1]) left += 1;
                            while (left<right&&nums[right]==nums[right-1]) right -= 1;
                            left++;
                            right--;
                        }else if(nums[i]+nums[j]+nums[left]+nums[right]>target){
                            right--;
                        }else{
                            left++;
                        }
                    }
                }
            }
            return res;
        }
    }
}