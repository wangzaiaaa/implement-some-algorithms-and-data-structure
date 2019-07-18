class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2) -> map.get(n2)-map.get(n1));
        for(int num:map.keySet()){
            pq.add(num);
        }
        List<Integer> res = new ArrayList<>();
        while(k>0&&!pq.isEmpty()){
            res.add(pq.poll());
            k--;
        }
        return res;
        
    }
}