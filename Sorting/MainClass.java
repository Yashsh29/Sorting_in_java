package sorting;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MainClass {

		static int length;
		static int arr[];
		static Scanner sc=new Scanner(System.in); 
		
		public void getarray() {
		    
		    System.out.println("Enter the number of elements you want to store: ");   
		     length=sc.nextInt();  
		    arr = new int[length];  
		    System.out.println("Enter the elements of the array: ");  
		    for(int i=0; i<length; i++){  
		    	arr[i]=sc.nextInt();  
		    }  

		}
		
		public void display(int result[]) {
	        for(int i=0;i<result.length;i++) {
	        	System.out.print(result[i] + " ");
	        }
	        System.out.println();
	 	}
		
		 public static void main(String args[])
		    {	
				long startTime,endTime,time;
			 	int algo;
			 	MainClass get = new MainClass();

			 	do {
			 	System.out.println("Enter your choice : ");
			 	System.out.println("1. Merge Sort");
			 	System.out.println("2. Heap Sort");
			 	System.out.println("3. QuickSort");
			 	System.out.println("4. QuickSort using 3 median");
			 	System.out.println("5. Insertion Sort");
			 	System.out.println("6. Selection Sort");
			 	System.out.println("7. Bubble Sort");
			 	System.out.println("8. Compare");
			 	System.out.println("9. Exit");
			 	algo=sc.nextInt();
			 	get.getarray();
			 	
			 	switch(algo) {
			 	case 1 :// Merge Sort
			 		startTime = System.nanoTime();
			 		MergeSort ms = new MergeSort();
			 		System.out.println("Before Sorting");
			 		get.display(arr);
			 		ms.sort(arr,0,arr.length-1);
			 		System.out.println("After Sorting using Merge Sort");
			 		get.display(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Merge sort took " + time + " ns for input with array length "+arr.length);
				 	break; 
				 	
			 	case 2 :// Heap Sort
			 		startTime = System.nanoTime();
			 		HeapSort hs = new HeapSort();
			 		System.out.println("Before Sorting");
			 		get.display(arr);
			 		hs.sort(arr);
			 		System.out.println("After Sorting using Heap Sort");
			 		get.display(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Heap sort took " + time + " ns for input with array length "+arr.length);
				 	break; 
			        
			 	case 3 ://Quick Sort
			 		startTime = System.nanoTime();
			 		QuickSort qs = new QuickSort();
			 		System.out.println("Before Sorting");
			 		get.display(arr);
			 		qs.sort(arr,0,arr.length-1);
			 		System.out.println("After Sorting using Quick Sort");
			 		get.display(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Quick sort took " + time + " ns for input with array length "+arr.length);
				 	break;
			 		
			 	case 4 ://Quick Sort using 3 median
			 		startTime = System.nanoTime();
			 		QuickSort3way qs3 = new QuickSort3way();
			 		System.out.println("Before Sorting");
			 		get.display(arr);
			 		qs3.sort(arr,0,arr.length-1);
			 		System.out.println("After Sorting using Quick Sort 3 median");
			 		get.display(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Quick sort using 3 median took " + time + " ns for input with array length "+arr.length);
				 	break;
			 		
			 	case 5 :// Insertion Sort
			 		startTime = System.nanoTime();
			 		InsertionSort is = new InsertionSort();
			 		System.out.println("Before Sorting");
			 		get.display(arr);
			 		is.sort(arr);
			 		System.out.println("After Sorting using Insertion Sort");
			 		get.display(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Insertion sort took " + time + " ns for input with array length "+arr.length);
				 	break;
			 		
			 	case 6 :// Selection Sort
			 		startTime = System.nanoTime();
			 		SelectionSort ss = new SelectionSort();
			 		System.out.println("Before Sorting");
			 		get.display(arr);
			 		ss.sort(arr);
			 		System.out.println("After Sorting using Selection Sort");
			 		get.display(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Selection sort took " + time + " ns for input with array length "+arr.length);
				 	break;
			 		
			 	case 7 :// Bubble Sort
			 		startTime = System.nanoTime();
			 		BubbleSort bs = new BubbleSort();
			 		System.out.println("Before Sorting");
			 		get.display(arr);
			 		bs.sort(arr);
			 		System.out.println("After Sorting using Bubble Sort");
			 		get.display(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Bubble sort took " + time + " ns for input with array length "+arr.length);
			 		break;
			 		
			 	case 8 :
			 		// Merge Sort
			 		startTime = System.nanoTime();
			 		MergeSort ms1 = new MergeSort();
			 		ms1.sort(arr,0,arr.length-1);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("MergeSort :"+ time);
			 		
			 		// Heap Sort
			 		startTime = System.nanoTime();
			 		HeapSort hs1 = new HeapSort();
			 		hs1.sort(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("HeapSort :"+ time);
			 		
			 		// Quick Sort
			 		startTime = System.nanoTime();
			 		QuickSort qs1 = new QuickSort();
			 		qs1.sort(arr,0,arr.length-1);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Quick Sort :"+ time);
			 		
			 		// Quick Sort using 3 median
			 		startTime = System.nanoTime();
			 		QuickSort3way qs3_1 = new QuickSort3way();
			 		qs3_1.sort(arr,0,arr.length-1);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("Quick Sort using 3 median :"+ time);
			 		
			 		// Insertion Sort
			 		startTime = System.nanoTime();
			 		InsertionSort is1 = new InsertionSort();
			 		is1.sort(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("InsertionSort :"+ time);
			 		
			 		// Selection Sort
			 		startTime = System.nanoTime();
			 		SelectionSort ss1 = new SelectionSort();
			 		ss1.sort(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("SelectionSort :"+ time);
			 		
			 		// Bubble Sort
			 		startTime = System.nanoTime();
			 		BubbleSort bs1 = new BubbleSort();
			 		bs1.sort(arr);
			 		endTime = System.nanoTime();
			 		time = endTime - startTime; 
			 		System.out.println("BubbleSort :"+ time);
			 		System.out.println();
			 		break;
			 		
			 	case 9 :
			 		System.exit(0);
			 		break;
			 		
			 	default :
			 		System.out.println("Invalid Input");	
			
			 	}
		    }while(true);
			 	
			 	
		        
		    }
	}

