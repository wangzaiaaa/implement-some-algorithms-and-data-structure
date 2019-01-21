package src.Leetcode;

class Solution {
    public String longestPalindrome(String s) {
        String reverseS = (new StringBuilder(s)).reverse().toString();
        int maxLength = 0;
        if(s.equals("")) return "";
        if(s.length()==1) return s;
        String str = s.substring(0,1);
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.substring(i,j+1).equals(reverseS.substring(s.length()-j-1,s.length()-i))&&j-i+1>maxLength){
                    maxLength = j-i+1;
                    str = s.substring(i,j+1);


                }
            }
        }
        return str;

    }
    public static void main(String [] args){

    }
}
