public class LargestEle {

    class Solution {
        public static int largest(int n, int[] arr) {
            // code here
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i]);
            }
            return max;
        }
    }

}