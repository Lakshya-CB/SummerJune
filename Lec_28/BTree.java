package Lec_28;

public class BTree {
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

	public BTree(int[] in, int[] pre) {
		// TODO Auto-generated constructor stub
		root = createInPre(in, 0, in.length - 1, pre, 0, in.length - 1);
	}

	private Node createInPre(int[] in, int is, int ie, int[] pre, int ps, int pe) {
		if (ps > pe || is > ie) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int ali = pre[ps];
		int found = is;
		int L_size = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == ali) {
				found = i;
				break;
			}
			L_size++;
		}
		nn.left = createInPre(in, is, found - 1, pre, ps + 1, ps + L_size);
		nn.right = createInPre(in, found + 1, ie, pre, ps + L_size + 1, pe);
		return nn;
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
		}
		boolean sp1 = find(nn.left, ali);
		boolean sp2 = find(nn.right, ali);
		return sp1 || sp2;
	}

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int sp1 = Ht(nn.left);
		int sp2 = Ht(nn.right);

		return Math.max(sp1, sp2) + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int sp1 = Dia(nn.left);
		int sp2 = Dia(nn.right);
		int self = Ht(nn.left) + Ht(nn.right) + 2;
		return Math.max(Math.max(sp1, sp2), self);
	}

	private pair Dia2(Node nn) {
		if (nn == null) {
			return new pair();
		}
		pair sp1 = Dia2(nn.left);
		pair sp2 = Dia2(nn.right);
		
		int self = sp1.Ht + sp2.Ht + 2;
		pair ans = new pair();
		ans.Dia=  Math.max(Math.max(sp1.Dia, sp2.Dia), self);
		ans.Ht = Math.max(sp1.Ht, sp2.Ht)+1;
		return ans;
	}

	class pair {
		int Ht = -1;
		int Dia = 0;
	}
	public BTree(int[] pre) {
		pidx=0;
		root = createPre(pre);
	}
	int pidx=0;
	private Node createPre(int[] pre) {
		if(pre[pidx]==-1) {
			pidx++;
			return null;
		}
		Node nn = new Node(pre[pidx]);
		pidx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);
		return nn;
	}
}
