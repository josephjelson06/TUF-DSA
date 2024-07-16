import java.util.Arrays;

public class FloorCeil {
    int getFloor(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;

        int floor = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= x) {
                floor = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return floor;
    }

    int getCeil(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;

        int ceil = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= x) {
                ceil = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ceil;
    }

    // Pair getFloorAndCeil(int[] arr, int n, int x) {
    //     // code here
    //     Arrays.sort(arr);
    //     return new Pair(getFloor(arr, n, x), getCeil(arr, n, x));
    // }
}
