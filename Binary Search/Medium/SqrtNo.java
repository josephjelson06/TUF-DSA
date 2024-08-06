public class SqrtNo {
    long floorSqrt(long x) {
        // Your code here
        long low = 0;
        long high = x;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }
}
