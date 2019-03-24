class Problem274 {
    public int hIndex(int[] citations) {
        int length = citations.length;
        if(citations==null || citations.length<1) return 0;
        int sum = 0;
        for(int i=length;i>=1;i--){
            sum = 0;
            for(int j=0;j<length;j++){
                if(citations[j]>=i) sum++;
            }
            if(sum>=i) return i;
        }
        return 0;
    }
}