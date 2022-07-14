package Lec_09;

public class Array_basic_Q {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
//		System.out.println(Max(arr));
		System.out.println(-500002%5);
		Disp(arr);
//		Rotate(arr, 2);
		Rotate2(arr,2);
		Disp(arr);
	}

	public static void RevPrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int Max(int[] arr) {
//		int jeb = arr[0];
		int jeb = Integer.MIN_VALUE;
		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int Find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}

	public static void Reverse(int[] arr) {
		int L = 0;
		int R = arr.length - 1;
		while (L < R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}
	public static void Reverse(int[] arr,int L, int R) {
		while (L < R) {
			int temp = arr[L];
			arr[L] = arr[R];
			arr[R] = temp;
			L++;
			R--;
		}
	}

	public static void Disp(int[] arr) {
		for (int item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

	public static void Rotate(int[] arr, int rot) {
		rot = rot % arr.length;
		if(rot<0) {
			rot = rot+arr.length;
		}
		for (int r = 0; r < rot; r++) {
			int last = arr[arr.length - 1];
			for (int i = arr.length - 1; i >= 1; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = last;
		}
	}
	public static void Rotate2(int[] arr, int rot) {
		rot = rot % arr.length;
		if(rot<0) {
			rot = rot+arr.length;
		}
		Reverse(arr,0,arr.length-1);// reverse arr!!
		Reverse(arr,0,rot-1);//REV BODY
		Reverse(arr,rot,arr.length-1);//REV dhakkan
	}
}
