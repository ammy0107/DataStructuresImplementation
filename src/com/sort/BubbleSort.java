package com.sort;

import com.utils.Utils;

public class BubbleSort {
	public static void main(String[] args) {
		int arrLength = 2;
		int[] arr = Utils.randomNumberArr(arrLength);
		
		bubbleSort(arr);
		Utils.printIntArr(arr);	
	}

	public static void bubbleSort(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
