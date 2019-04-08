class Problem88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] answer = new int [nums1.length];
        int i=0,j=0,z=0;
        while(i<m||j<n){
            if(i>=m)answer[z++] = nums2[j++];
            else if(j>=n) answer[z++] = nums1[i++];
            else if(nums1[i]<nums2[j]) answer[z++]=nums1[i++];
            else answer[z++] = nums2[j++];
        }
        for(int p=0;p<z;p++){
            nums1[p] = answer[p];
        }
    }
}