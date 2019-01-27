class Problem13 {
    public int romanToInt(String s) {
        int num = 0;
        for(int i=s.length()-1;i>=0;i--){
            char chr = s.charAt(i);
            if(chr=='I'){
                num += 1;
            }
            else if(chr=='V'){
                if((i-1)>=0&&s.charAt(i-1)=='I'){
                    num += 4;
                    i -=1;
                }else{
                    num += 5;
                }
            }
            else if(chr=='X'){
                 if((i-1)>=0&&s.charAt(i-1)=='I'){
                    num += 9;
                    i -=1;
                }else{
                    num += 10;
                }
                
            }
            else if(chr=='L'){
                 if((i-1)>=0&&s.charAt(i-1)=='X'){
                    num += 40;
                    i -=1;
                }else{
                    num += 50;
                }
                
            }
            else if(chr=='C'){
                 if((i-1)>=0&&s.charAt(i-1)=='X'){
                    num += 90;
                    i -=1;
                }else{
                    num += 100;
                }
                
            }
            else if(chr=='D'){
                 if((i-1)>=0&&s.charAt(i-1)=='C'){
                    num += 400;
                    i -=1;
                }else{
                    num += 500;
                }
                
            }
            else if(chr=='M'){
                 if((i-1)>=0&&s.charAt(i-1)=='C'){
                    num += 900;
                    i -=1;
                }else{
                    num += 1000;
                }    
            }
        }
        
        return num;
    }
}