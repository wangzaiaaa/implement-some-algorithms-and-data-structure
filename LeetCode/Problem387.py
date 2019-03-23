class Solution:
    def kthSmallest(self, matrix: List[List[int]], k: int) -> int:
        if(matrix==None or len(matrix)<1):
            return 0 
        li = [i for elem in matrix for i in elem]
        li.sort()
        if(len(li)<k):
            return 0
        else:
            return li[k-1]