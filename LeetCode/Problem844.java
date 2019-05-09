class Solution {
    public boolean backspaceCompare(String S, String T) {
        if(S==null&&T==null) return true;
        else if(S==null||T==null) return false;
        char [] str1 = new char[S.length()];
        char [] str2 = new char[T.length()];
        int index1 = 0,index2 = 0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)!='#'){
                str1[index1++] = S.charAt(i);
            }else{
                if(index1>0){
                     index1--;
                }
            }
        }
         for(int i=0;i<T.length();i++){
            if(T.charAt(i)!='#'){
                str2[index2++] = T.charAt(i);
            }else{
                
                if(index2>0) index2--;
            }
        }
        if(index1!=index2) return false;
        for(int i=0;i<index1;i++){
            if(str1[i]!=str2[i]) return false;
        }
        return true;
        
    }
}