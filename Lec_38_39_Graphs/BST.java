package Lec_38_39_Graphs;

import java.util.ArrayList;
import java.util.HashMap;
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
		@Override
		public String toString() {
			return ""+data;
		}
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
}
