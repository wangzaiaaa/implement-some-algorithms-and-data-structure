class Solution {
    public List<Integer> getRow(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows<0) return null;
        List<Integer> one = new ArrayList<>();
        one.add(1);
        ans.add(one);
        if(numRows==0) return one;
        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        ans.add(two);
        if(numRows==1) return two;
        List<Integer> temp = two;
        for(int i=3;i<=numRows+1;i++){
            List<Integer> element = new ArrayList<>();
            element.add(1);
            for(int j=2;j<i;j++){
                element.add(temp.get(j-1)+temp.get(j-2));
            }
            element.add(1);
            ans.add(element);
            temp = element;
        }
        return ans.get(ans.size()-1);
    }
}