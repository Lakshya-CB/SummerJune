package Lec_23;

public class Stack {
	private int tos;
	private int[] arr;

	public Stack() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		tos = -1;
	}

	public int Size() {
		return tos + 1;
	}

	public boolean isEmpty() {
		return Size() == 0;
	}

	public boolean isFull() {
		return Size() == arr.length;
	}

	public void add(int ali) {
		if(isFull()) {
			throw new RuntimeException("nahi hoga bhai!");
		}
		arr[tos + 1] = ali;
		tos++;
	}

	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("gali bhai!");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}

	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("bhai kya deekh rha hein?");
		}
		return arr[tos];
	}

	public void push(int ali) {
		add(ali);
	}

	public void display() {
		int idx = this.tos;
		while (idx >= 0) {
			System.out.print(arr[idx] + " ");
			idx--;
		}
		System.out.println();

	}
}
