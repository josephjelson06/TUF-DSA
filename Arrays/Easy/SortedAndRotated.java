public class SortedAndRotated {
    class Solution {
        public boolean check(int[] nums) {
            // Intuition: There will be a small change due to rotation in the array at only
            // one place, so if there are irregularities more than once, return false, else
            // true;
            int n = nums.length;
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[(i + 1) % n]) {
                    count++;
                }
            }
            if (count > 1) {
                return false;
            }
            return true;
        }
    }
}
