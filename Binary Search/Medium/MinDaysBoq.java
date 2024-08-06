public class MinDaysBoq {
    public int minEle(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[i], min);
        }
        return min;
    }

    public int maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long val = (long) m * k;
        if (val > n) {
            return -1;
        }
        int low = minEle(bloomDay);
        int high = maxEle(bloomDay);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public boolean isPossible(int[] bloomDay, int day, int m, int k) {
        int n = bloomDay.length;
        int count = 0;
        int noOfB = 0;
        for (int i = 0; i < n; i++) {
            if (bloomDay[i] <= day) {
                count++;
            } else {
                noOfB += (count / k);
                count = 0;
            }
        }
        noOfB += (count / k);
        return noOfB >= m;
    }
}