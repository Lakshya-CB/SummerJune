package Lec_25;

public class Dynamic_Q extends Queue {
	@Override
	public void add(int ali) {
		if(isFull()) {
			int[] big = new int[arr.length*2];
			for(int i=0;i<size;i++) {
				big[i] = arr[(s+i)%arr.length];
			}
			arr= big;
			s=0;
		}
		super.add(ali);
	}
}
