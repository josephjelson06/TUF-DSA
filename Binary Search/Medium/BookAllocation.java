import java.util.ArrayList;

public class BookAllocation {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        // Arrays.sort(arr);
        // Collections.sort(arr);

        // for (int i = maxEle(arr); i <= arrSum(arr); i++) {
        // int calStud = calcStudents(arr, i, m);
        // if (calStud == m) {
        // return i;
        // }
        // }

        if (m > n) {
            return -1;
        }
        int low = maxEle(arr);
        int high = arrSum(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int calcStud = calcStudents(arr, mid, m);
            if (calcStud > m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static int calcStudents(ArrayList<Integer> arr, int pages, int m) {
        int student = 1;
        int pagesStudent = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                pagesStudent += arr.get(i);
            } else {
                student++;
                pagesStudent = arr.get(i);
            }
        }
        return student;
    }

    public static int maxEle(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(arr.get(i), max);
        }
        return max;
    }

    public static int arrSum(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        return sum;
    }
}
