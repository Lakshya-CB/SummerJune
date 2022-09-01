package Lec_32;

import java.util.Collections;
import java.util.PriorityQueue;

public class PQ_demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> PQ = new PriorityQueue<>(Collections.reverseOrder());
		PQ.add(10);//log(n)
		PQ.add(7);
		PQ.add(100);
		PQ.add(15);
		PQ.add(8);
		
		System.out.println(PQ);
		System.out.println(PQ.poll());//log(n)
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		System.out.println(PQ.poll());
		
		
		System.out.println("======");
		minHeap H = new minHeap();
		H.add(10);//log(n)
		H.add(7);
		H.add(100);
		H.add(15);
		H.add(8);
		
		System.out.println(H.AL);
		System.out.println(H.poll());//log(n)
		System.out.println(H.poll());
		System.out.println(H.poll());
		System.out.println(H.poll());
		System.out.println(H.poll());
	}
}
