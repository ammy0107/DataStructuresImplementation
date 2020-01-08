package com.sort;

import java.util.*;
import java.util.PriorityQueue;

import com.ds.ListNode;

public class HeapSort {

	public static int minimumCostToConnectRopes(int[] ropeLengths) {
		
		
		ListNode node = new ListNode(10, null);
		ListNode node1 = node;
		
		System.out.println(node);
		System.out.println(node1);

//		
//		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(2, (n1, n2) -> n1 - n2);
//
//		for (int i = 0; i < ropeLengths.length; i++)
//			minHeap.add(ropeLengths[i]);
//
//		int result = 0, temp = 0;
//		while (minHeap.size() > 1) {
//			temp = minHeap.poll() + minHeap.poll();
//			result += temp;
//			minHeap.add(temp);
//		}

		return 1;
	}

	public static void main(String[] args) {
		int result = minimumCostToConnectRopes(new int[] { 1, 3, 11, 5 });
		System.out.println("Minimum cost to connect ropes: " + result);
		result = minimumCostToConnectRopes(new int[] { 3, 4, 5, 6 });
		System.out.println("Minimum cost to connect ropes: " + result);
		result = minimumCostToConnectRopes(new int[] { 1, 3, 11, 5, 2 });
		System.out.println("Minimum cost to connect ropes: " + result);
	}

}
