class Problem495 {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries==null||timeSeries.length<1) return 0;
        if(timeSeries.length==1) return duration;
        int sumtime = 0;
        for(int i=1;i<timeSeries.length;i++){
            int current = timeSeries[i]-timeSeries[i-1];
            if(current<duration) sumtime += current;
            else sumtime+=duration;
        }
        sumtime += duration;
        return sumtime;
    }
}