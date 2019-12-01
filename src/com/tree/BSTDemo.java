package com.tree;

public class BSTDemo {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 5, 6, 2, 14 };
		BST bst = new BST();

		for (int i : arr) {
			bst.add(i);
		}
		
		System.out.println(bst.search(15));
	}
}
