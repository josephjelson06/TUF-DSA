public class FindSmallestDivGivenThreshold {
    public int smallestDivisor(int[] nums, int threshold) {

        // Any divisor 'd' must divide all the elements of the array in such a way that
        // the sum of their ceil values <= threshold value

        int n = nums.length;
        if (n > threshold) {
            return -1;
        }
        int low = 1;
        int high = maxEle(nums);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sum = helper(nums, mid);
            if (sum <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public int helper(int[] nums, int d) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += Math.ceil((double) nums[i] / (double) d);
        }
        return sum;
    }

    public int maxEle(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }
}
