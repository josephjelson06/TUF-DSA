// package Arrays.Medium;

import java.util.*;

public class TwoSum {

    // Note: Since indices are required, can't modify the array. So sorting not
    // allowed.
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int arr[] = new int[2];

        arr[0] = -1;
        arr[1] = -1;

        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int diff = target - nums[i];
            if (mpp.containsKey(diff)) {
                arr[0] = mpp.get(diff);
                arr[1] = i;
            } else {
                mpp.put(nums[i], i);
            }
        }
        return arr;
    }
}