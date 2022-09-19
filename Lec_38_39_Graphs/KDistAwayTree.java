package Lec_38_39_Graphs;

import java.util.HashMap;

import Lec_38_39_Graphs.BST.Node;

public class KDistAwayTree {
	public static void main(String[] args) {
		int[] lvl = { 10, 20, 30, 40, 50, -1, 70, -1, -1, 100 };
		BST BT = new BST(lvl, false);
		BT.Disp();
		HashMap<Node, HashMap<Node, Integer>> map = new HashMap<>();
		conv(BT.root, map);
		System.out.println(map);
	}

	public static void conv(Node nn, HashMap<Node, HashMap<Node, Integer>> map) {
		if(nn==null) {
			return;
		}
		conv(nn.left, map);
		conv(nn.right, map);
		map.put(nn, new HashMap<>());
		HashMap<Node, Integer> nn_nbr = map.get(nn);
		if (nn.left != null) {
			nn_nbr.put(nn.left, 0);
			map.get(nn.left).put(nn, 0);
		}
		if (nn.right!=null) {
			nn_nbr.put(nn.right, 0);
			map.get(nn.right).put(nn, 0);
		}
	}
}
