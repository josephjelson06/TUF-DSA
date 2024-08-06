public class NextPermutation {

    // 1. Longer Prefix Match a[i] < a[i+1]
    // 2. Find someone > a[idx], but the smallest one, so you can stay close
    // 3. Place remaining eles (arr[idx+1] to a[n-1] in sorted order)
    public void nextPermutation(int[] nums) {

        // Step 1:
        int n = nums.length;
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }
        if (idx == -1) {
            // reverse nums;
            reverseArray(nums, 0, n - 1);
            return;
        }

        // Step 2:
        for (int i = n - 1; i > idx; i--) {
            // swap
            if (nums[i] > nums[idx]) {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        // Step 3: Reverse a[idx+1] to a[n-1] - both indices included
        reverseArray(nums, idx + 1, n - 1);

    }

    public void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
