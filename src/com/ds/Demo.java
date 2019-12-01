package com.ds;


import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// Implement ArrayList
		// Implement Doubly LinkedList
		// Implement HashTable
		//Implement stack using array
		//Implement stack using arraylist
		//Implement stack using LinkedList
		//Implement queue using array
		//Implement queue using arraylist
		//Implement queue using LinkedList
		//Implement Merge Sort
		//Implement Quick Sort
		//Implement Heap Sort
		
		//Write the timecomplexity of all the methods that are available for OOTB collections
		
		ArrayList<String> wtr = new ArrayList<String>();
		wtr.add("tst");
		wtr.add("fasdf");
		wtr.add("asdfasdf");
		wtr.add("fassdfasdfdf");
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Amitesh");
		ll.add("Jain");
		
		Iterator<String> itr = ll.iterator();
		
		//while(itr.hasNext())
			//System.out.println(itr.next());
		
		
		Queue<String> q = new LinkedList<String>();
		
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.offer(100);
		pq.offer(37);
		pq.offer(76);
		pq.offer(23);
		pq.offer(01);
		pq.offer(45);
		
		while(pq.size() > 0) {
			System.out.println(pq.poll());
		}
		
	}

}
