package Lec_38_39_Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
//HashMap<V1,Nbr> map = new HashMap<>();
//	HashMap<V1,HashMap<V2,Wt>> map = new HashMap<>();
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int numV) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int V = 1; V <= numV; V++) {
			map.put(V, new HashMap<>());
		}
	}

	public void addEdge(int V1, int V2, int Wt) {
		HashMap<Integer, Integer> V1_Nbr = map.get(V1);
		V1_Nbr.put(V2, Wt);

		HashMap<Integer, Integer> V2_Nbr = map.get(V2);
		V2_Nbr.put(V1, Wt);

	}

	public boolean containsEdge(int V1, int V2) {
		return map.get(V1).containsKey(V2);
	}

	public int edgeWt(int V1, int V2) {
		return map.get(V1).get(V2);
	}

	public void removeEdge(int V1, int V2) {
		map.get(V1).remove(V2);
		map.get(V2).remove(V1);
	}

	public int numOfEdge() {
		int ans = 0;
		for (int V1 : map.keySet()) {
			HashMap<Integer, Integer> Nbr_V1 = map.get(V1);
//			for(int nbr : Nbr_V1.keySet()) {
//				ans++;
//			}
			ans = ans + Nbr_V1.size();
		}
		return ans / 2;
	}

	public boolean hasPath(int curr, int Dest, HashSet<Integer> Visited, String path) {
//		BP : 1,6?
//		SP : 1 ke nbrs to 6?
		if (curr == Dest) {
			System.out.println(path);
			return true;
		}
		if (Visited.contains(curr)) {
			return false;
		}
		boolean ans = false;
		Visited.add(curr);
		for (int nbr : map.get(curr).keySet()) {
			boolean sp = hasPath(nbr, Dest, Visited, path + nbr + " ");
			ans = ans || sp;
		}
		Visited.remove(curr);
		return ans;
	}

	public void BFS(int V1) {
		Queue<Integer> Q = new LinkedList<>();
		HashSet<Integer> Visited = new HashSet<Integer>();

		Q.add(V1);
		while (!Q.isEmpty()) {
			int curr = Q.poll();
			if (Visited.contains(curr)) {
				System.out.println("cycle hein babu!!");
				continue;
			}
			System.out.print(curr + " ");
			Visited.add(curr);
			for (int nbr : map.get(curr).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}

	public void BFT() {
		int numComp = 0;
		HashSet<Integer> Visited = new HashSet<Integer>();
		for (int V1 : map.keySet()) {
			if (Visited.contains(V1)) {
				continue;
			}
			numComp++;
			Queue<Integer> Q = new LinkedList<>();

			Q.add(V1);
			while (!Q.isEmpty()) {
				int curr = Q.poll();
				if (Visited.contains(curr)) {
					System.out.println("cycle hein babu!!");
					continue;
				}
				System.out.print(curr + " ");
				Visited.add(curr);
				for (int nbr : map.get(curr).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
		}

	}

	class Dijpair implements Comparable<Dijpair> {
		int V;
		int Wt;

		public Dijpair(int v, int wt) {
			V = v;
			Wt = wt;
		}

		@Override
		public int compareTo(Dijpair o) {
//			this and o
			return this.Wt - o.Wt;
		}
	}

	public void Dijkstra(int srcV) {
		PriorityQueue<Dijpair> PQ = new PriorityQueue<>();
		HashSet<Integer> Visited = new HashSet<>();
		PQ.add(new Dijpair(srcV, 0));
		while (!PQ.isEmpty()) {
			Dijpair Dest = PQ.poll();
			if(Visited.contains(Dest.V)) {
				continue;
			}
			Visited.add(Dest.V);
			System.out.println(Dest.V + " from " + srcV + " with Wt " + Dest.Wt);
			for (int nbr : map.get(Dest.V).keySet()) {
				if (!Visited.contains(nbr)) {
					int Edge_wt = map.get(Dest.V).get(nbr);
					PQ.add(new Dijpair(nbr, Dest.Wt + Edge_wt));
				}
			}
		}
	}
}
