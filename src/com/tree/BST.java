package com.tree;

public class BST {
	TreeNode root;
	TreeNode temp;

	public void add(int value) {
		TreeNode node = new TreeNode(value);

		if (root == null) {
			root = node;
			return;
		}

		temp = root;

		while (temp != null) {
			if (temp.value == value) {
				System.out.println("The value already exists!!");
				break;
			} else if (temp.value > value) {
				if (temp.left == null) {
					temp.left = node;
					break;
				}
				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = node;
					break;
				}
				temp = temp.right;
			}
		}
	}

	public boolean search(int value) {
		temp = root;

		if (temp == null)
			return false;

		while (temp != null) {
			if (temp.value == value)
				return true;
			else if (temp.value > value)
				temp = temp.left;
			else
				temp = temp.right;
		}

		return false;
	}

	public void delete(int value) {

	}
}
