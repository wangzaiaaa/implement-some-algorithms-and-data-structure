class Solution {
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while(num>=1000){
            num -=1000;
            sb.append('M');
            if(num==900){
                sb.append('C');
                sb.append('M');
                num = 0;
            }
            
        }
        if(num>900){
            sb.append('C');
            sb.append('M');
            num -= 900;
        }
        while(num>=500){
             if(num==900){
                sb.append('C');
                sb.append('M');
                num = 0;
             }
             else{
                 num -= 500;
                 sb.append('D');
             }
             if(num==400){
                 sb.append('C');
                 sb.append('D');
                 num = 0;
             }
             
        }
        if(num>400){
             sb.append('C');
             sb.append('D');
             num -=400;
        }
        while(num>=100){
             if(num==400){
                 sb.append('C');
                 sb.append('D');
                 num = 0;
             }
             else{
                 num -= 100;
                 sb.append('C');
             }
             if(num==90){
                 sb.append('X');
                 sb.append('C');
                 num = 0;
             }
            
        }
        if(num>90){
              sb.append('X');
              sb.append('C'); 
              num -=90;
        }
        while(num>=50){
            if(num==90){
                 sb.append('X');
                 sb.append('C');
                 num = 0;
             }
            else{
                num -= 50;
                 sb.append('L');
                
            }
            if(num==40){
                 sb.append('X');
                 sb.append('L');
                 num = 0;
                
            }
            
        }
        if(num>40){
            sb.append('X');
            sb.append('L');
            num -=40;
            
        }
        while(num>=10){
             if(num==40){
                 sb.append('X');
                 sb.append('L');
                 num = 0;
                
             }
            else{
                num -= 10;
                 sb.append('X');
                
            }
            if(num==9){
                 sb.append('I');
                 sb.append('X');
                 num = 0;
                
            }
            
        }
        if(num>9){
            sb.append('I');
            sb.append('X'); 
            num -= 9;
        }
        while(num>=5){
             if(num==9){
                 sb.append('I');
                 sb.append('X');
                 num = 0;
                
            }
            else{
                num -= 5;
                 sb.append('V');
                
            }
             if(num==4){
                 sb.append('I');
                 sb.append('V');
                 num = 0;
                
            }
            
        }
        if(num >4){
             sb.append('I');
             sb.append('V');
             num -= 4;            
        }
        while(num>=1){
             if(num==4){
                 sb.append('I');
                 sb.append('V');
                 num = 0;
                
            }
              else{
                num -= 1;
                 sb.append('I');
                
            }
            
        }
        return sb.toString();
        
        
    }
}