class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if(people==null||people.length<1||limit<=0) return 0;
        Arrays.sort(people);
        int ans = 0,index1 = 0,index2 = people.length-1;
        while(index1<=index2){
            if(people[index1]+people[index2]<=limit){
                ans++;
                index1++;
                index2--;
            }else{
                index2--;
                ans++;
            }
        }
        return ans;
    }
}