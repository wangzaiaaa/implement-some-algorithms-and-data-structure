from math import factorial
class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        if(m<0 or n<0):
            return 0
        elif(m==1 and n==1):
            return 1
        else:
            x = m+n-2
            y = m-1
            return int(factorial(x)/(factorial(y)*factorial(x-y)))