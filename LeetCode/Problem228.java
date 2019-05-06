class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums==null||nums.length<1) return list;
        int start = 0,end = 1;
        if(nums.length==1){
            list.add(String.valueOf(nums[0]));
        }else{
            while(start<nums.length||end<nums.length){
                if(start==nums.length-1){
                    list.add(String.valueOf(nums[start]));
                    break;
                }else if(end >= nums.length){
                    list.add((String.valueOf(nums[start])+"->"+String.valueOf(nums[nums.length-1])));
                    break;
                }
                else{
                    if(nums[end]-nums[end-1]==1){
                        end++;
                    }else{
                        if(end-start<=1){
                            list.add(String.valueOf(nums[start]));
                            start = end;
                            end += 1;
                        }else{
                            list.add(String.valueOf(nums[start])+"->"+String.valueOf(nums[end-1]));
                            start = end;
                            end = start + 1;
                        }
                    }
                }
            }
        }
        return list;
    }
}