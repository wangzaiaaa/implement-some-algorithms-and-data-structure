class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        if(strs==null||strs.length<1) return new ArrayList<>();
        Map<String,List> map = new HashMap<>();
        for(String s:strs){
            char [] ca = s.toCharArray();
            Arrays.sort(ca);
            String str = String.valueOf(ca);
            if(!map.containsKey(str)) map.put(str,new ArrayList<>());
            map.get(str).add(s);
        }
        return new ArrayList(map.values());
    }
}