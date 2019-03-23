class Problem551 {
    public boolean checkRecord(String s) {
        if(s==null||s.length()<1) return false;
        boolean flag = true;
        int Absent = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)=='A') Absent++;
            if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L'){
                flag = false;
                break;
            }
        }
        if(s.charAt(s.length()-1)=='A') Absent++;
        if(s.length()>=2&&s.charAt(s.length()-2)=='A') Absent++;
        return (Absent<=1&&flag);
    }
}