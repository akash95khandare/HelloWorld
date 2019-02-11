package com.bridgelab.algorithm;

import com.bridgelab.utility.Utility;

public class Merge {

	public static void main(String args[]) throws InterruptedException {
		
		long start;
		String str[] = {"K","H","U","E","Ahetesham","Akash","Rohan","A"};
		int arr[] = new int[] {9,4,5,65,48,6,74,78,96,52,636};
//		Utility.displayStringArr(str);
		Utility u =new Utility();
		
		start = u.startWatch();
		System.out.println("Merge sort");
		Utility.mergeSort(str, 0, str.length-1);
		Utility.displayStringArr(str);
		System.out.println("\nTime :"+u.elapseTime(start));
		
		start = u.startWatch();
		System.out.println("Bubble sort ");
		Utility.displayStringArr(Utility.bubbleSortStr(str, 0, str.length-1));
		System.out.println("\nTime :"+u.elapseTime(start));
		
		start = u.startWatch();
		System.out.println("Insertion sort");
		Utility.displayStringArr(Utility.insertionSortStr(str, 0, str.length-1));
		System.out.println("\nTime :"+u.elapseTime(start));

		start = u.startWatch();
		System.out.println("Binary search");
		Utility.binarySearchStr(str, 0, str.length-1, "Ahetesham");
		System.out.println("\nTime :"+u.elapseTime(start));

		start = u.startWatch();
		System.out.println("Bubble sort ");
		Utility.displayIntArr(Utility.bubbleSortInt(arr, 0, arr.length-1));
		System.out.println("\nTime :"+u.elapseTime(start));

		start = u.startWatch();
		System.out.println("Insertion sort");
		Utility.displayIntArr(Utility.insertionSortInt(arr, 0, arr.length-1));
		System.out.println("\nTime :"+u.elapseTime(start));

	}
}
