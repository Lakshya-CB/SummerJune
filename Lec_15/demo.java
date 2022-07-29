package Lec_15;

public class demo {
	public static void main(String[] args) {
		int n = 100000;
		long start = System.currentTimeMillis();
		String str = "";
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < n; i++) {
//			str = str + i; //O(n)
//			int j  = i+2; //O(1)
			sb.append(i);
		}
		str = sb.toString();
		long end = System.currentTimeMillis();
		System.out.println((end-start)/1000.0);
	}
}
