class Problem150 {
    public int evalRPN(String[] tokens) {
        if(tokens==null||tokens.length<1) return 0;
        Stack<String> val = new Stack<>();
        int i = 0;
        int x=0,y=0;
        String str = null;
        while(i<tokens.length){
            if(tokens[i].equals("+")){
                if(val.isEmpty()) return 0;
                x = Integer.valueOf(val.pop());
                if(val.isEmpty()) return 0;
                y = Integer.valueOf(val.pop());
                val.push(String.valueOf(y+x));
            }else if(tokens[i].equals("-")){
                if(val.isEmpty()) return 0;
                x = Integer.valueOf(val.pop());
                if(val.isEmpty()) return 0;
                y = Integer.valueOf(val.pop());
                val.push(String.valueOf(y-x));
               
            }else if(tokens[i].equals("*")){
                if(val.isEmpty()) return 0;
                x = Integer.valueOf(val.pop());
                if(val.isEmpty()) return 0;
                y = Integer.valueOf(val.pop());
                val.push(String.valueOf(x*y));
            }else if(tokens[i].equals("/")){
                if(val.isEmpty()) return 0;
                x = Integer.valueOf(val.pop());
                if(val.isEmpty()) return 0;
                y = Integer.valueOf(val.pop());
                val.push(String.valueOf((int)(y/x)));
            }
            else{
                val.push(tokens[i]);
            }
            i++;
        }
        return Integer.valueOf(val.pop());
    }
}