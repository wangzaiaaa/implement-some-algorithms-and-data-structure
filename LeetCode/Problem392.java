class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s==null||t==null||s.length()>t.length()) return false;
        if(s.length()==0) return true;
        int index = 0;
        for(int i = 0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(index)){
                if(++index==s.length()) return true;
            }
        }
        return false;
    }
}