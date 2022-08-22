package Lec_25;

public class Queue {
	int[] arr;
	int size;
	int s;

	public Queue() {
		// TODO Auto-generated constructor stub
		arr = new int[5];
		s = 0;
		size = 0;
	}

	public void add(int ali) {
		int idx = s + size;
		arr[idx % arr.length] = ali;
		size++;
	}

	public int peek() {
		return arr[s];
	}

	public int poll() {
		int ans = arr[s];
		s = (s + 1) % arr.length;
		size--;
		return ans;
	}

	public boolean isFull() {
		return size == arr.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
}
