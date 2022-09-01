package Lec_31_32;

public class LinkedList<TT> {
	class Node {
		public Node(TT ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		TT data;
		Node next;
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " => ");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return count;
	}

	public TT getFirst() {
		return head.data;
	}

	public TT getLast() {
		Node temp = head;

		while (temp.next != null) {
//			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return temp.data;
	}

	public TT getAt(int idx) {
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	public void addLast(TT ali) {
		Node nn = new Node(ali);
		if(head ==null) {
			head = nn;
			return;
		}
		Node temp = head;

		while (temp.next != null) {
//			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		temp.next = nn;
	}
}
