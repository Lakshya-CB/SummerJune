package Lec_28_29_pract.prec;

import java.util.*;

public class isBalaced {



	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		System.out.println(bt.isBalanced());
	}

	static class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {

			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node node) {
			// write your code here
			if (node == null) {
				return new BalancedPair();
			}
			BalancedPair sp1 = isBalanced(node.left);
			BalancedPair sp2 = isBalanced(node.right);

			BalancedPair ans = new BalancedPair();
			ans.height = Math.max(sp1.height, sp2.height) + 1;
			ans.isBalanced = false;
			if (sp1.isBalanced && sp2.isBalanced) {
				boolean self = Math.abs(sp1.height - sp2.height) <= 1;
				ans.isBalanced = self;
			}

			return ans;
		}

		private class BalancedPair {
			int height = -1;
			boolean isBalanced = true;
		}

	}
}
