class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl=matrix.length;
        int cl=matrix[0].length;
        int n=rl*cl;
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int ri=mid/cl;
            int ci=mid%cl;
            if(matrix[ri][ci]==target){
                return true;
            }
            if(matrix[ri][ci]<target){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return false;
    }
}