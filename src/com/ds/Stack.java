package com.ds;

public class Stack<T> {
	private int top;
	private int maxSize;
	private T[] arr;

	@SuppressWarnings("Unchecked")
	public Stack(int max_size) {
		this.maxSize = max_size;
		this.top = -1;
		arr = (T[]) new Object[max_size];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public boolean isFull() {
		return maxSize == top + 1;
	}

	public T top() {
		if (isEmpty())
			return null;

		return arr[top];
	}

	public void push(T data) {
		if (isFull())
			return;

		top++;
		arr[top] = data;
	}

	public T pop() {
		if (isEmpty())
			return null;

		T temp = arr[top];
		top--;
		return temp;
	}
}
