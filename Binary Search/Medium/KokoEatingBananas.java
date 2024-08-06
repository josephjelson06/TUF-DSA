public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = findMax(piles);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int reqdTime = helper(piles, mid);
            if (reqdTime <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int helper(int piles[], int hourly) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += Math.ceil((double) piles[i] / (double) hourly);
        }
        return time;
    }

    public int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < piles.length; i++) {
            max = Math.max(piles[i], max);
        }
        return max;
    }
}
