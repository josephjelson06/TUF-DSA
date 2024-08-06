public class MedianOfTwoSortedArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;

        int n1 = nums1.length;
        int n2 = nums2.length;

        int n = n1 + n2;

        int cnt = 0;

        int idx2 = n/2;
        int idx1 = idx2-1;

        int idx1el = -1;
        int idx2el = -1;

        // ArrayList<Integer> list = new ArrayList<>();

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                if (cnt == idx1)
                    idx1el = nums1[i];
                if (cnt == idx2)
                    idx2el = nums1[i];

                cnt++;
                i++;

            } else {

                if (cnt == idx1)
                    idx1el = nums2[j];
                if (cnt == idx2)
                    idx2el = nums2[j];

                cnt++;
                j++;
            }
        }

        // Insert remaining elements
        while (i < n1) {
            if (cnt == idx1)
                idx1el = nums1[i];
            if (cnt == idx2)
                idx2el = nums1[i];

            cnt++;
            i++;

        }
        while (j < n2) {
            if (cnt == idx1)
                idx1el = nums2[j];
            if (cnt == idx2)
                idx2el = nums2[j];

            cnt++;
            j++;
        }
        // int n = n1 + n2;

        // length is odd
        if (n % 2 == 1) {
            return (double) idx2el;
        }
        return (double) (idx1el + idx2el) / 2.0;
    }
}
