package com.epam.liliana_smirnova.java.lesson1.task1;

import java.util.Arrays;

public class LogicArrayProcessing {
	
	static int[] array;
	static int sizeArr = 20;
	
	public  void runnerApp() {
		
	    System.out.println("Autogenerate an array of numbers from -10 to 10");
	    array = createAndFillRandomArray(sizeArr);
	    System.out.println("\nSwap the maximum negative element and the minimum positive:");
	    swapMaxMinElement(sizeArr);
	    System.out.println("\nDetermine the sum of the elements consisting of even positions:");
	    sumElementsEvenPositions();
	    System.out.println("\nReplacing negative elements with zeros:");
	    replaceNegativeElements(sizeArr);
	    System.out.println("\nTriple each positive element,which is facing the negative:");
	    triplePositiveElements(sizeArr);
	    System.out.println("\nFind the difference between the arithmetic mean and the minimum element:");
	    differenceAverageAndMinElement();
	}
	
	 private static int[] createAndFillRandomArray(int n) {
		  
	        int[] arr = new int[n];
	        for (int i = 0; i < n; i++) {
	        	arr[i] = (int) ((Math.random() * 21) - 10);
	        }
	        System.out.println(Arrays.toString(arr));
	        return arr;
	 }
	 
	 private static void swapMaxMinElement(int n) {
		    int[] arr = new int[n];
		    System.arraycopy(array,0,arr,0,n);
		    int max_negative = Integer.MIN_VALUE;
	        int min_positive = Integer.MAX_VALUE;
	        int positive = 0, negative = 0;
	        int temp;
	        for (int i = 0; i < arr.length; i++) {
	            if ((arr[i] < 0) && (max_negative < arr[i])) {
	                max_negative = arr[i];
	                negative = i;
	            }
	            if ((arr[i] > 0) && (min_positive > arr[i])) {
	                min_positive = arr[i];
	                positive = i;
	            }
	        }
	        
	        temp = arr[negative];
	        arr[negative] = arr[positive];
	        arr[positive] = temp;
	 
	        System.out.println(Arrays.toString(arr));
	 }
	 
	 private static void sumElementsEvenPositions() {		 
		    int sum = 0;
	        for (int i = 0; i < array.length; i += 2) sum += array[i];
	        System.out.println(sum);
	 }
	 
	 private static void replaceNegativeElements(int n) {		 
		 int[] arr = new int[n];
		 System.arraycopy(array,0,arr,0,n);
		 
		 for (int i = 0; i < arr.length; i++) {
	            if (arr[i] < 0) { arr[i]= 0;}
	     }
	     System.out.println(Arrays.toString(arr));
  }
	 
	 private static void triplePositiveElements(int n) {
		 int[] arr = new int[n];
		 System.arraycopy(array,0,arr,0,n);
		 
		 for (int i = 1; i < arr.length; i++) {
	         if ((arr[i] > 0) && (arr[i-1] < 0))
	            { arr[i]= arr[i]*3;}
	     }
	     System.out.println(Arrays.toString(arr));
	 }
	 
	 private static void differenceAverageAndMinElement() {		 
		 int min = Integer.MIN_VALUE;
		 double average;
		 int sum = 0;
		 for (int i = 0; i < array.length; i++) sum += array[i];
		 average = sum/array.length;
		 
		 System.out.println(average - min);
	 }
}
