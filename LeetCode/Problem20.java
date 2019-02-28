class Problem20 {
    public boolean isValid(String s) {
        if(s.length()==0) return true;
        if(s.length()%2==1) return false;
        Stack<Character> stack = new Stack<>();
        boolean match = true;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char temp = 'a';
            if(c=='{'||c=='('||c=='['){
                stack.push(c);
            }
            else if(c==')'){
                if(stack.empty()||stack.pop()!='(') match = false;
            }
            else if(c==']'){
                if(stack.empty()||stack.pop()!='[') match = false;
            }
            else if(c=='}'){
                if(stack.empty()||stack.pop()!='{') match = false;
            }else{
                match = false;
            }
            if(!match){
                break;
            }
        }
        if(!stack.empty())match=false;
        return match;
        
    }
}