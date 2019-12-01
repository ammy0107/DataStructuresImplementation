package com.utils;

import java.util.Random;

public class Utils {
	public static int[] randomNumberArr(int length) {
		int[] arr = new int[length];
		Random rd = new Random();
		
		for (int i = 0; i < length; i++) {
			arr[i] = rd.nextInt(500);
		}
	
		return arr;
	}
	
	public static void printIntArr(int[] arr) {
		StringBuilder sb = new StringBuilder();
		String separator = "";

		for (int i = 0; i < arr.length; i++) {
			sb.append(separator + arr[i]);
			separator = " | ";
		}
		
		System.out.println(sb.toString());
	}
}