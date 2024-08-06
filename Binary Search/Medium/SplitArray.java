public class SplitArray {
    public int splitArray(int[] nums, int k) {
        int low = maxEle(nums);
        int high = arrSum(nums);

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int func = func(nums, mid, k);
            if (func > k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public int func(int[] arr, int maxSum, int k) {
        int subArr = 1;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= maxSum) {
                sum += arr[i];
            } else {
                subArr++;
                sum = arr[i];
            }
        }
        return subArr;
    }

    public static int maxEle(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
