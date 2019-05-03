public class Solution {
    public static void main(String[] args) {
        int [] array = {3,5,7,8,9,10,11};
        System.out.println(new Solution().findAll(500,0,array,0,0));
        System.out.println(new Solution().change(500,array));
    }
    //DFS
    public int findAll(int amount,int cur,int [] coins,int count,int layel){
        if(cur>amount) return 0;
        else if(cur==amount){
            return 1;
        }else{
            int cou = 0;
            for(int i=layel;i<coins.length;i++){
                if(layel==coins.length-1){
                    cou += findAll(amount,cur+coins[layel],coins,count,layel);
                }else{
                    cou += findAll(amount,cur+coins[i],coins,count,i);
                }
            }
            return cou;
        }
    }
    //DP
    public int change(int amount, int[] coins) {
        int [] dp = new int[amount+1];
        dp[0] = 1;
        for(int i=0;i<coins.length;i++){
            for(int j=coins[i];j<=amount;j++){
                dp[j] =dp[j] + dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
}