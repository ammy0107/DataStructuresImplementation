package com.sort;

import com.utils.Utils;

public class SelectionSort {

	public static void main(String[] args) {
		int arrLength = 10;
		int[] arr = Utils.randomNumberArr(arrLength);

		selectionSort(arr);
		Utils.printIntArr(arr);
	}

	public static void selectionSort(int[] arr) {
		int length = arr.length;

		for (int i = 0; i < length - 1; i++) {
			int minIdx = i;

			for (int j = i; j < length - 1; j++) {

				if (arr[minIdx] > arr[j + 1]) {
					minIdx = j + 1;
				}
			}

			if (minIdx != i) {
				int temp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = temp;
			}
		}
	}
}
