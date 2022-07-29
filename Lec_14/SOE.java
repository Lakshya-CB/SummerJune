package Lec_14;

public class SOE {
	public static void main(String[] args) {
		solve(100);
	}

	public static void solve(int n) {
		boolean[] isComposite = new boolean[n + 1];
		for (int div = 2; div * div <= n; div++) {
			if (isComposite[div] == false) {
				for (int table = 2 * div; table <= n; table = table + div) {
					isComposite[table] = true;
				}
			}
		}
		for(int i = 2;i<=n;i++) {
			if(isComposite[i]==false) {
				System.out.println(i);
			}
		}
	}
}
