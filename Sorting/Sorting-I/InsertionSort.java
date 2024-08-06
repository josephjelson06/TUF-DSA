public class InsertionSort {
    static void insert(int arr[], int i) {
        int key = arr[i];
        int j = i - 1;

        // We run a loop from j and keep shifting the array elements
        // towards right till the element at jth index is greater
        // than element at ith index(key).
        while (j >= 0 && arr[j] > key) {
            // Shifting of array elements.
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        // Then we just insert the current element(key) at (j+1)th index.
        arr[j + 1] = key;
    }

    // Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n) {
        int i;
        for (i = 1; i < n; i++)
            // Calling of insert function.
            insert(arr, i);
    }
}
