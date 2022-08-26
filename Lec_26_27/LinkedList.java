package Lec_26_27;

import java.util.Stack;

public class LinkedList {
	class Node {
		public Node(int ali) {
			// TODO Auto-generated constructor stub
			data = ali;
		}

		int data;
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

	public int getFirst() {
		return head.data;
	}

	public int getLast() {
		Node temp = head;

		while (temp.next != null) {
//			count++;
//			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		return temp.data;
	}

	public int getAt(int idx) {
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;
	}

	private Node getNodeAt(int idx) {
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(int ali) {
		Node nn = new Node(ali);
		if (head == null) {
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

	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(int idx, int ali) {
		if (idx < 0 || idx > size()) {
			throw new RuntimeException("bhai rehene de");
		}
		if (idx == 0) {
			addFirst(ali);
			return;
		}
		Node prev = getNodeAt(idx - 1);
		Node after = prev.next;
		Node curr = new Node(ali);
		prev.next = curr;
		curr.next = after;
//		curr.next = prev.next;
	}

	public int removeLast() {
		if (size() == 0) {
			throw new RuntimeException("bhai rehene de");
		}
		if (size() == 1) {
			Node last = head;
			head = null;
			return last.data;
		}
		Node secondLast = getNodeAt(size() - 2);
		Node last = secondLast.next;
		secondLast.next = null;
		return last.data;
	}

	public int removeFirst() {
		if (size() == 0) {
			throw new RuntimeException("bhai rehene de");
		}

		Node temp = head;
		head = head.next;
		return temp.data;
	}

	public int removeAt(int idx) {
		if (size() <= idx || idx < 0) {
			throw new RuntimeException("bhai rehene de");
		}
		if (idx == 0) {
			return removeFirst();
		}
		if (idx == size() - 1) {
			return removeLast();
		}
		Node prev = getNodeAt(idx - 1);
		Node curr = prev.next;
		Node after = curr.next;
		prev.next = after;
		return curr.data;
	}

	public void rev() {
		Node curr = head;
		Node prev = null;
		while (curr != null) {
			Node after = curr.next;
			curr.next = prev;

			prev = curr;
			curr = after;
		}
		head = prev;
	}

	public void Rev2() {
		Node temp = head;
		Rev(head);
		temp.next = null;
	}

	public void Rev(Node prev) {
		if (prev.next == null) {
			head = prev;
			return;
		}
		Node curr = prev.next;
		Rev(curr);
		curr.next = prev;
	}

	public void kRev(int k) {
		Node temp = head;
		Node tail = null;
		Node nnhead = null;

		Stack<Node> S = new Stack<>();
		while (temp != null) {
			Node after = temp.next;
			S.add(temp);
			if (S.size() == k) {
				while (!S.isEmpty()) {
					Node curr = S.pop();
					if (tail == null) {
						tail = curr;
						nnhead = curr;

					} else {
						tail.next = curr;
						tail = curr;
					}
				}

			}

			temp = after;
		}
		while (!S.isEmpty()) {
			Node curr = S.pop();
			if (tail == null) {
				tail = curr;
				nnhead = curr;

			} else {
				tail.next = curr;
				tail = curr;
			}
		}

		tail.next = null;
		head = nnhead;
	}

	public int mid() {
		Node slow = head;
		Node fast = head;
//		while (fast != null || fast.next != null) {
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}

	public int lastK(int k) {
		Node ahead = head;
		for (int i = 1; i <= k; i++) {
			ahead = ahead.next;
		}
		Node curr = head;
		while (ahead != null) {
			ahead = ahead.next;
			curr = curr.next;
		}
		return curr.data;
	}

	public boolean hasCycle() {
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}

	public void delCycle() {
		if (!hasCycle()) {
			return;
		}
		Node slow = head;
		Node fast = head;
		while (true) {
			slow = slow.next;
			fast = fast.next.next;
			if (fast == slow) {
				break;
			}
		}
		Node curr = head;
		while (curr.next != slow.next) {
			curr = curr.next;
			slow = slow.next;
		}
		slow.next =null;
	}
}
