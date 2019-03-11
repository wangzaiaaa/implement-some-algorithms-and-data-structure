class Problem89 {
    public List<Integer> grayCode(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<1<<n;i++){
            answer.add(i^i>>1);
        }
        return answer;
    }
    
}