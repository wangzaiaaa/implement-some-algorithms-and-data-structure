class Solution {
public int longestValidParentheses(String s) {
        if(s==null||s.length()<1) return 0;
        Stack<Integer> s1 = new Stack<>();
        int ans = 0;
        s1.push(-1);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                s1.push(i);
            }else{
                s1.pop();
                if(s1.isEmpty()){
                    s1.push(i);
                }else{
                    ans = Math.max(ans,i-s1.peek());
                }

            }
        }
        return ans;
    }
}