package sorting;

public class MergeSort {

	 void merge(int arr[], int left, int mid, int right)
	    {
	        int no1 = mid - left + 1;
	        int no2 = right - mid;
	 
	        int leftarr[] = new int[no1];
	        int rightarr[] = new int[no2];
	 
	        for (int i = 0; i < no1; ++i)
	            leftarr[i] = arr[left + i];
	        for (int j = 0; j < no2; ++j)
	            rightarr[j] = arr[mid + 1 + j];
	 

	        int i = 0, j = 0;
	 

	        int k = left;
	        while (i < no1 && j < no2) {
	            if (leftarr[i] <= rightarr[j]) {
	                arr[k] = leftarr[i];
	                i++;
	            }
	            else {
	                arr[k] = rightarr[j];
	                j++;
	            }
	            k++;
	        }
	 

	        while (i < no1) {
	            arr[k] = leftarr[i];
	            i++;
	            k++;
	        }
	 

	        while (j < no2) {
	            arr[k] = rightarr[j];
	            j++;
	            k++;
	        }
	    }

	    void sort(int arr[], int left, int right)
	    {
	        if (left < right) {

	            int mid =left+ (right-left)/2;
	 

	            sort(arr, left, mid);
	            sort(arr, mid + 1, right);
	 
	            
	            merge(arr, left, mid, right);
	        }
	    }
}
