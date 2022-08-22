package Lec_25;

public class LinkedList {
	class Node {
		int data;
		Node next;
	}

	Node head;
	public void disp() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public int size() {
		Node temp = head;
		int count =0;
		while(temp!=null) {
			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return count;
	}
	public int getFirst() {
		return head.data;
	}
	public int getLast() {
		Node temp = head;

		while(temp.next!=null) {
//			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return temp.data;
	}
	public int getAt(int idx) {
		Node temp = head;
		for(int i=1;i<=idx;i++) {
			temp = temp.next;
		}
		return temp.data;
	}
}
