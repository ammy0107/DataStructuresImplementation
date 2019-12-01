package com.ds;

public class LinkedListCustom<T> {
	ListNode head;

	public LinkedListCustom() {
	}

	public void add(Object value) {
		ListNode node = new ListNode(value, null);

		if (head == null)
			head = node;
		else {
			node.next = head;
			head = node;
		}
	}

	public void delete() {
		if (head == null)
			throw new IllegalStateException();

		head = head.next;
	}

	@SuppressWarnings("unchecked")
	public void printLinkedList() {
		ListNode node = head;

		while (node != null) {
			System.out.println((T)node.value);
			node = node.next;
		}
	}
}
