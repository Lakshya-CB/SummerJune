package Lec_08;

public class function_demo {
	public static void main(String[] args) {
		add2(10,20);
		int sum1 = add1(10,20);
	}
	public static int add1(int a, int b) {
		int ans = a + b;
//		System.out.println(ans);
		return ans;
	}
	public static void add2(int a, int b) {
		int ans = a + b;
		System.out.println(ans);
		return ;
//		System.out.println("dsgdfsv"); 
	}
	
}
