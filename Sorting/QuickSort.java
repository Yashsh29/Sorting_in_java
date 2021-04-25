package sorting;

public class QuickSort {

	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}	 
	static int partition(int[] arr, int left, int right)
	{
	     
	    int pivot = arr[right];

	    int i = (left - 1);
	 
	    for(int j = left; j <= right - 1; j++)
	    {

	        if (arr[j] < pivot)
	        {
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, right);
	    return (i + 1);
	}
	void sort(int[] arr, int left, int right)
	{
	    if (left < right)
	    {  int pivot = partition(arr, left, right);
	        sort(arr, left, pivot - 1);
	        sort(arr, pivot + 1, right);
	    }
	}
}
