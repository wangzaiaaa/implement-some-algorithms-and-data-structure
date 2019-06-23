class Solution {
    public boolean PredictTheWinner(int[] nums) {
        if(nums==null||nums.length%2==0) return true;
        int length = nums.length;
        //dp[i][j] ��ʾ�ȱȺ��ֻ�õĶ�ķ���
        int [][] dp = new int [length][length];
        //dp�ĳ�ʼ��
        for(int i=0;i<length;i++){
            dp[i][i] = nums[i];
        }
        for(int len=1;len<length;len++){
            for(int l=0,r=len;r<length;l++,r++){
            //��������num[l](���),�����õ����ֵΪdp[l+1][r]
			//��������num[r](�Ҳ�),�����õ����ֵΪdp[l][r-1]
			dp[l][r] = Math.max(nums[l] - dp[l + 1][r], nums[r] - dp[l][r - 1]);

            }
        }
        return dp[0][length-1] >= 0;
    }
}