class Problem258.java {
    public int addDigits(int num) {
        if(num<10) return num;
        while(num>=10){
            String number = String.valueOf(num);
            num = 0;
            for(int i=0;i<number.length();i++){
                num += number.charAt(i)-'0';
            }
        }
        return num;
    }
}