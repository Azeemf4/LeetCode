import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] a) {

        int r = a.length;
        int c = a[0].length;

        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = r - 1;
        int left = 0;
        int right = c - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int i = left; i <= right; i++) {
                ans.add(a[top][i]);
            }
            top++;

            // Top → Bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(a[i][right]);
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(a[bottom][i]);
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(a[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}