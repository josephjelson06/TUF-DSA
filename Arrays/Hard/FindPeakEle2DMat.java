public class FindPeakEle2DMat {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int maxIdx = maxIdx(mat, n, m, mid);

            int left = mid - 1 >= 0 ? mat[maxIdx][mid - 1] : -1;
            int right = mid + 1 < m ? mat[maxIdx][mid + 1] : -1;

            if (mat[maxIdx][mid] > left && mat[maxIdx][mid] > right) {
                return new int[] { maxIdx, mid };
            } else if (mat[maxIdx][mid] < left) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return new int[] { -1, -1 };
    }

    public int maxIdx(int mat[][], int n, int m, int col) {
        int idx = -1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (mat[i][col] > max) {
                max = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
}
