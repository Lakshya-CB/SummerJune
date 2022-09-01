package Lec_32;

import java.util.ArrayList;

public class minHeap {
	ArrayList<Integer> AL;

	public minHeap() {
		// TODO Auto-generated constructor stub
		AL = new ArrayList<>();
	}

	public int size() {
		return AL.size();
	}

	public boolean isEmpty() {
		return AL.isEmpty();
	}

	public void disp() {
		System.out.println(AL);
	}

	public int peek() {
		return AL.get(0);
	}

	public void add(int ali) {
		AL.add(ali);
		upHeapify(AL.size() - 1);

	}

	private void upHeapify(int ch) {
		int par = (ch - 1) / 2;
		if (AL.get(par) > AL.get(ch)) {
			chwap(ch, par);
			upHeapify(par);
		}
	}

	private void chwap(int i, int j) {
		int temp = AL.get(i);
		AL.set(i, AL.get(j));
		AL.set(j, temp);
	}

	public int poll() {
		int ans = AL.get(0);
		AL.set(0, AL.get(AL.size() - 1));
		AL.remove(AL.size() - 1);
		downHeapify(0);

		return ans;
	}

	private void downHeapify(int par) {
		int L = 2 * par + 1;
		int R = 2 * par + 2;
		int min = par;
		if (L < AL.size() && AL.get(L) < AL.get(min)) {
			min = L;
		}
		if (R < AL.size() && AL.get(R) < AL.get(min)) {
			min = R;
		}
		if (min != par) {
			chwap(min, par);
			downHeapify(min);
		}
	}
}
