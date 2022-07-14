package Lec_09;

public class Arrays_demo_2 {
	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n];
//		System.out.println(arr[2]);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		for(int item : arr) {
			System.out.print(item+" ");
		}
		
	}
}
