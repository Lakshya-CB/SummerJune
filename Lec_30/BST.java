package Lec_30;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void Disp() {
		Disp(root);
	}

	private void Disp(Node nn) {
//	nn se pura tree Disp(nn)
//		Disp(nn.left) , Disp(nn.right)
		if (nn == null) {
			return;
		}
		String ans = "";
		if (nn.left != null) {
			ans = ans + nn.left.data;
		}
		ans = ans + " => " + nn.data + " <= ";
		if (nn.right != null) {
			ans = ans + nn.right.data;
		}
		System.out.println(ans);
		Disp(nn.left);
		Disp(nn.right);
	}

	public BST(int[] lvl, boolean ll) {
		root = new Node(lvl[0]);
		Queue<Node> Q = new LinkedList<Node>();
		Q.add(root);
		int idx = 1;
		while (!Q.isEmpty()) {
			Node curr = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				curr.left = new Node(lvl[idx]);
				Q.add(curr.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				curr.right = new Node(lvl[idx]);
				Q.add(curr.right);
			}
			idx++;

		}

	}

	public int max() {
		return max(root);
	}

	private int max(Node nn) {
		if (nn.right == null) {
			return nn.data;
		}
		return max(nn.right);
	}

	public boolean find(int ali) {
		return find(root, ali);
	}

	private boolean find(Node nn, int ali) {
		if (nn == null) {
			return false;
		}
		if (nn.data == ali) {
			return true;
		} else if (ali < nn.data) {
			return find(nn.left, ali);
		} else {
			return find(nn.right, ali);
		}
	}

	public void add(int ali) {
		root = add(root, ali);
	}

	private Node add(Node nn, int ali) {
		if (nn == null) {
			return new Node(ali);
		}
		if (nn.data >= ali) {
			nn.left = add(nn.left, ali);
		} else {
			nn.right = add(nn.right, ali);
		}
		return nn;
	}

	public void delete(int ali) {
		root = delete(root, ali);
	}

	private Node delete(Node nn, int ali) {
		if(nn==null) {
			return nn;
		}
		// TODO Auto-generated method stub
		if (nn.data > ali) {
			nn.left = delete(nn.left, ali);
		} else if (nn.data < ali) {
			nn.right = delete(nn.right, ali);
		} else {
			// delete this node!!
//			case 1:leaf node
			if (nn.left == null && nn.right == null) {
				return null;
			}
//			case 2: 1 child
			else if (nn.left != null && nn.right == null) {
				return nn.left;
			} else if (nn.left == null && nn.right != null) {
				return nn.right;
			}
//			case 3: 2 child!!
			else {
				int min = min(nn.right);
				nn.data = min;
				nn.right = delete(nn.right, min);
				return nn;
			}
		}
		return nn;
	}

	private int min(Node right) {
		// TODO Auto-generated method stub
		return 0;
	}

}
