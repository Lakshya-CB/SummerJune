package Lec_10;

public class SubArrays {
	public static void main(String[] args) {
		int[] arr = { 10, 20, -25, 40,-100,150, 50 };
//		SubArraySum1(arr);
		System.out.println("==========");
//		SubArraySum2(arr);
		SubArraySum3(arr);

	}

	public static void SubArraySum1(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s+" - "+e);
				int sum = 0;
				for (int tt = s; tt <= e; tt++) {
					sum = sum + arr[tt];
					System.out.print(arr[tt] + " ");
				}
				System.out.println("=>" + sum);
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

	public static void SubArraySum2(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int s = 0; s < arr.length; s++) {
			int sum = 0;
			for (int e = s; e < arr.length; e++) {
//				add arr[e] in the sub array!!
				sum = sum + arr[e];
				System.out.println(sum);
				if (sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

	public static void SubArraySum3(int[] arr) {
//		Kadance 
		int sum = 0;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			System.out.println(sum+" , "+i);
			if (sum < 0) {
				sum = 0;
			}
			if (sum > max) {
				max = sum;
			}
		}

	}
}
