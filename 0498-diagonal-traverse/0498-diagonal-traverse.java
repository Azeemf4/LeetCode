class Solution {
    public int[] findDiagonalOrder(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int[] ans = new int[rows * cols];

        int r = 0;
        int c = 0;
        int k = 0;

        boolean up = true;

        while (k < rows * cols) {

            ans[k] = mat[r][c];
            k++;

            if (up) {

                // moving up-right
                if (c == cols - 1) {
                    r++;
                    up = false;
                }
                else if (r == 0) {
                    c++;
                    up = false;
                }
                else {
                    r--;
                    c++;
                }

            } else {

                // moving down-left
                if (r == rows - 1) {
                    c++;
                    up = true;
                }
                else if (c == 0) {
                    r++;
                    up = true;
                }
                else {
                    r++;
                    c--;
                }
            }
        }

        return ans;
    }
}