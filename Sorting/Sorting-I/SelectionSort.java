public class SelectionSort {
    int select(int arr[], int i) {
        int max = arr[0], ind = 0;
        for (int j = 1; j <= i; j++) // iterate through the array up to index i
        {
            if (arr[j] > max) // check if the current element is greater than the maximum element so far
            {
                ind = j; // update the index of the maximum element
                max = arr[j]; // update the maximum element
            }
        }
        return ind; // return the index of the maximum element
    }

    void selectionSort(int arr[], int n) {

        for (int i = n - 1; i >= 0; i--) // iterate through the array from the last element to the first element
        {
            int j = select(arr, i); // find the index of the maximum element up to index i

            int temp = arr[i]; // swap the current element with the maximum element
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}