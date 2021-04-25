package sorting;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

	public class GUI implements ActionListener{
		JButton MergeSort_button,HeapSort_button,QuickSort_button,Q3_buttton,InsertionSort_button,SelectionSort_button,BubbleSort_button,Exit_button,Compare_button;
		static int length;
		int arr[];
		JLabel getarray_label,getarraysize_label,sorted_label,disp1_label,unsorted_label,disp2_label,bs1_label,ss1_label,time_label,ms1_label,hs1_label,qs3_1_label,is1_label,qs1_label;
		JPanel button_panel,getarray_panel,getarraysize_panel,sorted_panel,compare_panel;
		JTextField getarray_input,getarraysize_input;
		static Scanner sc=new Scanner(System.in);
		JFrame frame;
		long startTime,endTime,time,sec_time;
		String text;
		GUI(){
				/****** MERGE SORT BUTTON ******/
				MergeSort_button = new JButton();
				MergeSort_button.setBounds(300,130, 200, 50);
				MergeSort_button.addActionListener(this);
				MergeSort_button.setText("Merge Sort");
				MergeSort_button.setFocusable(false);
				MergeSort_button.setHorizontalTextPosition(JButton.CENTER);
				
				/****** HEAP SORT BUTTON ******/
				HeapSort_button = new JButton();
				HeapSort_button.setBounds(100,230, 200, 50);
				HeapSort_button.addActionListener(this);
				HeapSort_button.setText("Heap Sort");
				HeapSort_button.setFocusable(false);
				HeapSort_button.setHorizontalTextPosition(JButton.CENTER);
				
				/****** Quick SORT BUTTON ******/
				QuickSort_button = new JButton();
				QuickSort_button.setBounds(100,230, 200, 50);
				QuickSort_button.addActionListener(this);
				QuickSort_button.setText("Quick Sort");
				QuickSort_button.setFocusable(false);
				QuickSort_button.setHorizontalTextPosition(JButton.CENTER);
				
				/****** Quick Sort using 3 median BUTTON ******/
				Q3_buttton = new JButton();
				Q3_buttton.setBounds(100,230, 200, 50);
				Q3_buttton.addActionListener(this);
				Q3_buttton.setText("Quick Sort using 3 median");
				Q3_buttton.setFocusable(false);
				Q3_buttton.setHorizontalTextPosition(JButton.CENTER);
				
				/****** Insertion SORT BUTTON ******/
				InsertionSort_button = new JButton();
				InsertionSort_button.setBounds(100,230, 200, 50);
				InsertionSort_button.addActionListener(this);
				InsertionSort_button.setText("Insertion Sort");
				InsertionSort_button.setFocusable(false);
				InsertionSort_button.setHorizontalTextPosition(JButton.CENTER);
				
				/****** Selection SORT BUTTON ******/
				SelectionSort_button = new JButton();
				SelectionSort_button.setBounds(100,230, 200, 50);
				SelectionSort_button.addActionListener(this);
				SelectionSort_button.setText("Selection Sort");
				SelectionSort_button.setFocusable(false);
				SelectionSort_button.setHorizontalTextPosition(JButton.CENTER);
				
				/****** Bubble SORT BUTTON ******/
				BubbleSort_button = new JButton();
				BubbleSort_button.setBounds(100,230, 200, 50);
				BubbleSort_button.addActionListener(this);
				BubbleSort_button.setText("Bubble Sort");
				BubbleSort_button.setFocusable(false);
				BubbleSort_button.setHorizontalTextPosition(JButton.CENTER);
				
				/****** Compare BUTTON ******/
				Compare_button = new JButton();
				Compare_button.setBounds(100,230, 200, 50);
				Compare_button.addActionListener(this);
				Compare_button.setText("Compare");
				Compare_button.setFocusable(false);
				Compare_button.setHorizontalTextPosition(JButton.CENTER);
				
//				/****** EXIT BUTTON ******/
//				Exit_button = new JButton();
//				Exit_button.setBounds(100,230, 200, 50);
//				Exit_button.addActionListener(this);
//				Exit_button.setText("EXIT");
//				Exit_button.setFocusable(false);
//				Exit_button.setHorizontalTextPosition(JButton.CENTER);
				
				/****** Display Text ******/
				getarraysize_label = new JLabel();
				getarraysize_label.setText("Enter Array Size: ");
				getarraysize_panel = new JPanel();
				
				/******INPUT TEXT FIELD ******/
				getarraysize_input = new JTextField();
				getarraysize_input.setPreferredSize(new Dimension(50,40));
				
				
				/****** Display Text ******/
				getarray_label = new JLabel();
				getarray_label.setText("Enter Array: ");
				getarray_panel = new JPanel();
				
				/******INPUT TEXT FIELD ******/
				getarray_input = new JTextField();
				getarray_input.setPreferredSize(new Dimension(700,40));
				
				/****** Display Sorted Array ******/
				sorted_label = new JLabel();
				disp1_label = new JLabel();
				unsorted_label = new JLabel();
				disp2_label = new JLabel();
				time_label = new JLabel();
				//sorted_label.setText("*********************");
				sorted_panel = new JPanel();
				sorted_panel.setLayout(new GridLayout(5,1));
				
				/****** Panel to Adjust Buttons ******/
				button_panel = new JPanel();
				button_panel.setPreferredSize(new Dimension(900,50));
//				button_panel.setBackground(Color.GREEN);
				button_panel.setLayout(new FlowLayout());
				
				/****** Compare panel ******/
				compare_panel = new JPanel();
				compare_panel.setPreferredSize(new Dimension(900,100));
				compare_panel.setLayout(new GridLayout(7,1));
				ms1_label = new JLabel();
				hs1_label = new JLabel();
				qs1_label = new JLabel();
				is1_label = new JLabel();
				qs3_1_label = new JLabel();
				ss1_label=new JLabel();
				bs1_label = new JLabel();
				
				
				
				frame = new JFrame();
				frame.setTitle("Sorting Algorithms");
				frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setSize(1000,800);
				
//				frame.add(getarraysize_panel);
//				getarraysize_panel.add(getarraysize_label);
//				getarraysize_panel.add(getarraysize_input);
//				getarraysize_panel.setVisible(true);
				
				frame.add(getarray_panel);
				getarray_panel.add(getarray_label);
				getarray_panel.add(getarray_input);
				getarray_panel.setVisible(true);
				
				
				frame.add(button_panel);
//				button_panel.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
				button_panel.add(MergeSort_button);
				button_panel.add(HeapSort_button);
				button_panel.add(QuickSort_button);
				button_panel.add(Q3_buttton);
				button_panel.add(InsertionSort_button);
				button_panel.add(SelectionSort_button);
				button_panel.add(BubbleSort_button);
				button_panel.setVisible(true);
				
				frame.add(sorted_panel);
				sorted_panel.add(disp1_label);
				sorted_panel.add(unsorted_label);
				sorted_panel.add(disp2_label);
				sorted_panel.add(sorted_label);
				sorted_panel.add(time_label);
				
				frame.add(Compare_button);
				frame.add(compare_panel);
				compare_panel.add(ms1_label);
				compare_panel.add(hs1_label);
				compare_panel.add(qs1_label);
				compare_panel.add(qs3_1_label);
				compare_panel.add(is1_label);
				compare_panel.add(ss1_label);
				compare_panel.add(bs1_label);
	
				
				compare_panel.setVisible(true);
				
				frame.setVisible(true);
//				frame.add(Exit_button);
		}
		
		public static void main(String args[]) {
			GUI gui = new GUI();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			/****** MERGE SORT BUTTON ******/
			if(e.getSource()== MergeSort_button) {
				System.out.println("Merge Sort");
			getarray();
			startTime = System.nanoTime();
	 		MergeSort ms = new MergeSort();
	 		System.out.println("Before Sorting");
	 		disp1_label.setText("Before Sorting");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		unsorted_label.setText(text);
	 		ms.sort(arr,0,arr.length-1);
	 		System.out.println("After Sorting using Merge Sort");
	 		disp2_label.setText("After Sorting using Merge Sort");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		sorted_label.setText(text);
	 		endTime = System.nanoTime();
	 		time = endTime - startTime; 
	 		System.out.println("Merge sort took " + time + " ns for input with array length "+arr.length);
	 		time_label.setText("Merge sort took " + time + " ns for input with array length "+arr.length);
			}

			/****** HEAP SORT BUTTON ******/
			if(e.getSource()== HeapSort_button) {
				System.out.println("Heap Sort");
			getarray();
			startTime = System.nanoTime();
			HeapSort hs = new HeapSort();
	 		System.out.println("Before Sorting");
	 		disp1_label.setText("Before Sorting");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		unsorted_label.setText(text);
	 		hs.sort(arr);
	 		System.out.println("After Sorting using Heap Sort");
	 		disp2_label.setText("After Sorting using Heap Sort");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		sorted_label.setText(text);
	 		endTime = System.nanoTime();
	 		time = endTime - startTime; 
	 		System.out.println("Heap sort took " + time + " ns for input with array length "+arr.length);
	 		time_label.setText("Heap sort took " + time + " ns for input with array length "+arr.length);
			}
 
			/****** Quick SORT BUTTON ******/
			if(e.getSource()== QuickSort_button) {
				System.out.println("Quick Sort");
			getarray();
			startTime = System.nanoTime();
			QuickSort qs = new QuickSort();
	 		System.out.println("Before Sorting");
	 		disp1_label.setText("Before Sorting");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		unsorted_label.setText(text);
	 		qs.sort(arr,0,arr.length-1);
	 		System.out.println("After Sorting using Quick Sort");
	 		disp2_label.setText("After Sorting using Quick Sort");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		sorted_label.setText(text);
	 		endTime = System.nanoTime();
	 		time = endTime - startTime; 
	 		System.out.println("Quick sort took " + time + " ns for input with array length "+arr.length);
	 		time_label.setText("Quick sort took " + time + " ns for input with array length "+arr.length);
			}

			/****** Quick SORT using 3 median BUTTON ******/
			if(e.getSource()== Q3_buttton) {
				System.out.println("Quick SORT using 3 median ");
			getarray();
			startTime = System.nanoTime();
			QuickSort qs = new QuickSort();
	 		System.out.println("Before Sorting");
	 		disp1_label.setText("Before Sorting");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		unsorted_label.setText(text);
	 		qs.sort(arr,0,arr.length-1);
	 		System.out.println("After Sorting using Quick Sort 3 median ");
	 		disp2_label.setText("After Sorting using Quick Sort 3 median ");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		sorted_label.setText(text);
	 		endTime = System.nanoTime();
	 		time = endTime - startTime; 
//	 		sec_time = TimeUnit.NANOSECONDS.toSeconds(time);
//	 		sec_time = time/1000000000;
	 		System.out.println("Quick Sort using 3 median  took " + time + " ns for input with array length "+arr.length);
	 		time_label.setText("Quick Sort using 3 median  took " + time + " ns for input with array length "+arr.length);
			}

			/****** Insertion SORT BUTTON ******/
			if(e.getSource()== InsertionSort_button) {
				System.out.println("Insertion Sort");
			getarray();
			startTime = System.nanoTime();
			InsertionSort is = new InsertionSort();
	 		System.out.println("Before Sorting");
	 		disp1_label.setText("Before Sorting");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		unsorted_label.setText(text);
	 		is.sort(arr);
	 		System.out.println("After Sorting using Insertion Sort");
	 		disp2_label.setText("After Sorting using Insertion Sort");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		sorted_label.setText(text);
	 		endTime = System.nanoTime();
	 		time = endTime - startTime; 
	 		System.out.println("Insertion sort took " + time + " ns for input with array length "+arr.length);
	 		time_label.setText("Insertion sort took " + time + " ns for input with array length "+arr.length);
			}
			
			/****** Selection SORT BUTTON ******/
			if(e.getSource()== SelectionSort_button) {
				System.out.println("Selection Sort");
			getarray();
			startTime = System.nanoTime();
			SelectionSort ss = new SelectionSort();
	 		System.out.println("Before Sorting");
	 		disp1_label.setText("Before Sorting");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		unsorted_label.setText(text);
	 		ss.sort(arr);
	 		System.out.println("After Sorting using Selection Sort");
	 		disp2_label.setText("After Sorting using Selection Sort");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		sorted_label.setText(text);
	 		endTime = System.nanoTime();
	 		time = endTime - startTime; 
	 		System.out.println("Selection sort took " + time + " ns for input with array length "+arr.length);
	 		time_label.setText("Selection sort took " + time + " ns for input with array length "+arr.length);
			}

			/****** Bubble SORT BUTTON ******/
			if(e.getSource()== BubbleSort_button) {
				System.out.println("Bubble Sort");
			getarray();
			startTime = System.nanoTime();
			BubbleSort bs = new BubbleSort();
	 		System.out.println("Before Sorting");
	 		disp1_label.setText("Before Sorting");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		unsorted_label.setText(text);
	 		bs.sort(arr);
	 		System.out.println("After Sorting using Bubble Sort");
	 		disp2_label.setText("After Sorting using Bubble Sort");
	 		display(arr);
	 		text=Arrays.toString(arr);
	 		sorted_label.setText(text);
	 		endTime = System.nanoTime();
	 		time = endTime - startTime; 
	 		System.out.println("Bubble sort took " + time + " ns for input with array length "+arr.length);
	 		time_label.setText("Bubble sort took " + time + " ns for input with array length "+arr.length);
			}
			
			/******COMPARE BUTTON ******/
			if(e.getSource()== Compare_button) {
				
		 		// Merge Sort
		 		startTime = System.nanoTime();
		 		MergeSort ms1 = new MergeSort();
		 		ms1.sort(arr,0,arr.length-1);
		 		endTime = System.nanoTime();
		 		time = endTime - startTime; 
		 		System.out.println("MergeSort :"+ time);
		 		ms1_label.setText("MergeSort :"+ time);
		 		
		 		// Heap Sort
		 		startTime = System.nanoTime();
		 		HeapSort hs1 = new HeapSort();
		 		hs1.sort(arr);
		 		endTime = System.nanoTime();
		 		time = endTime - startTime; 
		 		System.out.println("HeapSort :"+ time);
		 		hs1_label.setText("HeapSort :"+ time);
		 		
		 		// Quick Sort
		 		startTime = System.nanoTime();
		 		QuickSort qs1 = new QuickSort();
		 		qs1.sort(arr,0,arr.length-1);
		 		endTime = System.nanoTime();
		 		time = endTime - startTime; 
		 		System.out.println("Quick Sort :"+ time);
		 		qs1_label.setText("Quick Sort :"+ time);
		 		
		 		// Quick Sort using 3 median
		 		startTime = System.nanoTime();
		 		QuickSort3way qs3_1 = new QuickSort3way();
		 		qs3_1.sort(arr,0,arr.length-1);
		 		endTime = System.nanoTime();
		 		time = endTime - startTime; 
		 		System.out.println("Quick Sort using 3 median :"+ time);
		 		qs3_1_label.setText("Quick Sort using 3 median :"+ time);
		 		
		 		// Insertion Sort
		 		startTime = System.nanoTime();
		 		InsertionSort is1 = new InsertionSort();
		 		is1.sort(arr);
		 		endTime = System.nanoTime();
		 		time = endTime - startTime; 
		 		System.out.println("InsertionSort :"+ time);
		 		is1_label.setText("InsertionSort :"+ time);
		 		
		 		// Selection Sort
		 		startTime = System.nanoTime();
		 		SelectionSort ss1 = new SelectionSort();
		 		ss1.sort(arr);
		 		endTime = System.nanoTime();
		 		time = endTime - startTime; 
		 		System.out.println("SelectionSort :"+ time);
		 		ss1_label.setText("SelectionSort :"+ time);
		 		
		 		// Bubble Sort
		 		startTime = System.nanoTime();
		 		BubbleSort bs1 = new BubbleSort();
		 		bs1.sort(arr);
		 		endTime = System.nanoTime();
		 		time = endTime - startTime; 
		 		System.out.println("BubbleSort :"+ time);
		 		bs1_label.setText("BubbleSort :"+ time);
		 		System.out.println();
				
			}
		}
		
		public void getarray() {
		    
			String array=getarray_input.getText();
			String[] array_items=array.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
			arr = new int[array_items.length];

			for (int i = 0; i < array_items.length; i++) {
			    try {
			        arr[i] = Integer.parseInt(array_items[i]);
			    } catch (NumberFormatException nfe) {
			        System.out.println("Array has non integer values");
			    }
			}
			display(arr);

		}
		
		public void display(int arr[]) {
	        for(int i=0;i<arr.length;i++) {
	        	System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	 	}
		
		
	}

