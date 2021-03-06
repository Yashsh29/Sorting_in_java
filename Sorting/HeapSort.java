package sorting;

public class HeapSort {
	public void sort(int arr[])
    {
        int length = arr.length;
 
        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(arr, length, i);
 
        for (int i = length - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            heapify(arr, i, 0);
        }
    } 
    void heapify(int arr[], int n, int i)
    {
        int largest = i; 
        int left = 2 * i + 1; 
        int right = 2 * i + 2; 
 
        if (left < n && arr[left] > arr[largest])
            largest = left;
 
        if (right < n && arr[right] > arr[largest])
            largest = right;
 
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
}