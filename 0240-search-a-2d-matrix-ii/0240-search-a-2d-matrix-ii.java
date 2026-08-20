class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        int m=matrix.length;
        int r=0;
        int c=n-1;
        while(r<m&&c>=0){
            int mid=matrix[r][c];
            if(mid==target)
            return true;
            else if(mid>target){
                c--;
            }
            else
            r++;
        }
            return false;
    }
}