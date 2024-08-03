package Arrays.Medium;

// DNF- Dutch National Flag Algortihm
/*
 * arr[0 to low-1] = 0
 * arr[low to mid-1] = 1
 * arr[mid to high] = unsorted region
 * arr[high+1 to n-1] = 2
 */
public class SortColors {
    public void sortColors(int[] nums) {

        int n = nums.length;

        int low = 0;
        int mid = 0;
        int high = n - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap(low,mid)
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // swap(mid,high)
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

    }

}
