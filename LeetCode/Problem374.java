/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Problem374 extends GuessGame {
    public int guessNumber(int n) {
        if(n<=1) return 1;
        else{
            int low = 1,high=n,mid,flag;
            while(low<=high){
                mid = (int)(low + ((high-low)>>1));
                flag = guess(mid);
                if(flag==0) return mid;
                else if(flag>0) low = mid+1;
                else high = mid -1;
            }
            
        }
        return 0;
      }
}