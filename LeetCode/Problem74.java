class Problem74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix==null) return false;
        if(matrix.length<1) return false;
        if(matrix.length==1) return binarySearch(matrix,0,target);
        int i=0,mid=0,j=matrix.length-1,column=matrix[0].length-1;
        while(i<=j){
            mid = i + ((j-i)>>1);
            if(matrix[mid][column]==target) return true;
            else if(matrix[mid][column]>target) j=mid-1;
            else i=mid+1;
        }
        return binarySearch(matrix,i,target);
        
    }
    public static boolean binarySearch(int [][] matrix,int row,int target){
        if(row>=matrix.length) return false;
        if(matrix[row].length<1) return false;
        int col = matrix[0].length-1;
        int i=0,j=col,mid=0;
        while(i<=j){
            mid = i + ((j-i)>>1);
            if(matrix[row][mid]==target) return true;
            else if(matrix[row][mid]>target) j = mid - 1;
            else i = mid + 1;
        }
        return false;
    }
}