class Problem17 {
    public List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        if(digits==null || digits.length()<1) return answer;
        String [] S = new String[digits.length()];
        for(int i=0;i<digits.length();i++){
            switch(digits.charAt(i)){
                case '2' : S[i] = "abc";break;
                case '3' : S[i] = "def";break;
                case '4' : S[i] = "ghi";break;
                case '5' : S[i] = "jkl";break;
                case '6' : S[i] = "mno";break;
                case '7' : S[i] = "pqrs";break;
                case '8' : S[i] = "tuv";break;
                case '9' : S[i] = "wxyz";break;
            }
        }
        answer = addToList(S,0,"",answer);
        return answer;
        
        
    }
    private static List<String> addToList(String [] s,int i,String temp,List<String> list){
        if(i<s.length-1){
            for(int j=0;j<s[i].length();j++){
                list = addToList(s,i+1,temp+s[i].charAt(j),list);
            } 
            i++;
        }else{
            for(int z=0;z<s[i].length();z++){
                list.add(temp+s[i].charAt(z));
            }
        }
        return list;
    }
}