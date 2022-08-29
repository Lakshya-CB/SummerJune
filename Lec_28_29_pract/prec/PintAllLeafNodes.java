package Lec_28_29_pract.prec;

import java.util.*;

public class PintAllLeafNodes {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		BTree Bt = new BTree(scn);
		Bt.Lvl();

	}

	static class BTree {
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

		public BTree(Scanner scn) {
			root = new Node(scn.nextInt());
			Queue<Node> Q = new LinkedList<Node>();
			Q.add(root);
			while (!Q.isEmpty()) {
				Node curr = Q.poll();
				int L = scn.nextInt();
				if (L != -1) {
					curr.left = new Node(L);
					Q.add(curr.left);
				}
				int R = scn.nextInt();
				if (R != -1) {
					curr.right = new Node(R);
					Q.add(curr.right);
				}
			}

		}

		public void Lvl() {
			Queue<Node> Q = new LinkedList<Node>();
			Q.add(root);
			while (!Q.isEmpty()) {
				Node curr = Q.poll();
				if (curr.left == null && curr.right == null) {
					System.out.print(curr.data + " ");
				}
				if (curr.left != null) {
					Q.add(curr.left);
				}
				if (curr.right != null) {

					Q.add(curr.right);
				}
			}
		}
		
	}
}
