class Solution {
    public String largestNumber(int[] nums) {
        if(nums==null||nums.length<1) return "0";
        String [] array = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array,(s1,s2) -> (s2+s1).compareTo(s1+s2));
        StringBuilder sb = new StringBuilder();
        if(array[0].equals("0")) return "0";
        for(String s:array){
            sb.append(s);
        }
        return sb.toString();
    }
}