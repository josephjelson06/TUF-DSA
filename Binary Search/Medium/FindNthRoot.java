public class FindNthRoot {
    public int NthRoot(int n, int m) {
        // code here
        int low = 0;
        int high = m;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midN = (int) Math.pow(mid, n);
            if (midN == m) {
                return mid;
            } else if (midN < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
