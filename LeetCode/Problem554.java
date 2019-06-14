class Solution {
     public int leastBricks(List<List<Integer>> wall) {
        if(wall==null||wall.size()<1) return 0;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<wall.size();i++){
            List<Integer> temp = wall.get(i);
            int current = 0;
            for(int j=0;j<temp.size()-1;j++){
                current += temp.get(j);
                map.put(current,map.getOrDefault(current,0)+1);
            }
        }
        Set<Integer> set = map.keySet();
        int max = 0;
        for(Integer num : set){
            if(map.get(num) > max) max = map.get(num);
        }
        return wall.size() - max;
    }
}