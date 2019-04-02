class Problem344 {
    public void reverseString(char[] s) {
        if(s==null||s.length<2) return;
        int i=0,j=s.length-1;
        char temp = 'c';
        while(i<(s.length)/2){
            j=s.length-1-i;
            if(!(s[i]==s[j]||i==j)){
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;
            }
            i++;
        }
    }
}