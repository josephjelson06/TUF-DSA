public class KadaneAlgo {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        // Edge Case: Find minEle (if all negative array)
        int minEle = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            minEle = Math.max(minEle, nums[i]);
        }

        // Using Kadane's Algorithm
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum < 0) {
                sum = 0;
            }
            maxSum = Math.max(maxSum, sum);
        }
        if (maxSum <= 0) {
            return minEle;
        }
        return maxSum;
    }
}