package LeetCode;

import javax.print.DocFlavor;

public class Problem6 {
        public static String convert(String s, int numRows) {
            if(s.equals("")||s.length()==1||numRows==1) return s;
            StringBuilder sb = new StringBuilder();
            int columns = 0;
            Character [][] chr;
            if(numRows==2){
                columns = s.length()/2+2;
                int count = 0;
                chr = new Character[3][columns];
                for(int i=1;i<columns;i++){
                    for(int j=1;j<=2&&count<s.length();j++){
                        chr[j][i] = s.charAt(count++);
                    }
                }
            }else{
                columns = (s.length()/(2*numRows-2)+1)*(numRows-1);
                chr = new Character[numRows+1][columns];
                int count = 0;
                for(int i=1;i<columns&&count<s.length();i++){
                    int x = (i-1)%(numRows-1);
                    if(x==0){
                        for(int z=1;z<=numRows&&count<s.length();z++){
                            chr[z][i] = s.charAt(count++);
                        }
                    }
                    else if(count<s.length()){
                        chr[numRows-x][i] = s.charAt(count++);
                    }
                }
            }

            for(int i=1;i<=numRows;i++){
                for(int j=1;j<columns;j++){
                    if(chr[i][j]!=null){
                        sb.append(chr[i][j]);
                    }
                }
            }
            return sb.toString();
        }

}