class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max=0;
        int ans=0;
        int l=mat.length;
        for(int i=0;i<l;i++){
            int c=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    c++;
                }
            }
            if(c>max){
                max=c;
                ans=i;
            }
        }
        return new int[]{ans,max};
    }
}