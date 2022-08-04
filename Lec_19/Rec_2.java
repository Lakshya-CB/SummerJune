package Lec_19;

public class Rec_2 {
	public static void main(String[] args) {
//		ClimbSt(0, 4, "");
//		MazePath(0, 0,"", 2, 2);
		Partition("nitin", "");
	}

	public static void ClimbSt(int curr, int dest, String path) {
		if (curr == dest) {
			System.out.println(path);
			return;
		}
		if (curr > dest) {
			return;
		}

		ClimbSt(curr + 1, dest, path + 1);
		ClimbSt(curr + 2, dest, path + 2);
		ClimbSt(curr + 3, dest, path + 3);
	}

	public static void MazePath(int r, int c, String path, int dest_r, int dest_c) {
		if (r == dest_r && c == dest_c) {
			System.out.println(path);
			return;
		}
		if (r > dest_r || c > dest_c) {
			return;
		}
		MazePath(r, c + 1, path + "R", dest_r, dest_c);
		MazePath(r + 1, c, path + "D", dest_r, dest_c);

	}

	public static void Partition(String table, String bag) {
		if (table.isEmpty()) {
			System.out.println(bag);
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String part = table.substring(0, chakku);
			String reamin = table.substring(chakku);
			if (isPalin(part)) {
				// System.out.println(part+"-"+reamin);
				Partition(reamin, bag + "-" + part);
			}
		}
	}

	private static boolean isPalin(String part) {
		int s =0;int e =part.length()-1;
		while(s<e) {
			if(part.charAt(s)!=part.charAt(e)) {
				return false;
			}
			s++;e--;
		}
				
		return true;
	}
}
