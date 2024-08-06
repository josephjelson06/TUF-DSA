public class CapcityToShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        // for (int i = maxEle(weights); i <= arrSum(weights); i++) {

        // }
        if (days > weights.length) {
            return -1;
        }
        int low = maxEle(weights);
        int high = arrSum(weights);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int daysReqd = findDays(weights, mid);
            if (daysReqd <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int findDays(int weight[], int capacity) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weight.length; i++) {
            // no more room to accomodate today
            if (load + weight[i] > capacity) {
                days++;
                load = weight[i];
            }
            // room for more
            else {
                load += weight[i];
            }
        }
        return days;
    }

    public int maxEle(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public int arrSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}