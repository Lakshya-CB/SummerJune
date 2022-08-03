package Lec_17_18;

public class Rec_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 200, 40, -50 };
//		Print(arr, 0);
		System.out.println(Max(arr, 0));
	}

	public static void Print(int[] arr, int s) {
		if (s == arr.length) {
			return;
		}
		// BP : Print(arr,s)
//		SP : Print(arr,s+1)
		System.out.println(arr[s]);
		Print(arr, s + 1);

	}

	public static int Max(int[] arr, int s) {
		if (s == arr.length-1) {
			return arr[s];
		}
//		BP : Max(arr,s)
//		SP : Mar(arr,s+1)
		int sp = Max(arr, s + 1);
		return Math.max(arr[s], sp);
	}

	public static int FO(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
//		BP  : FO(arr,s,ali)
//		SP  : FO(arr,s+1,ali)

		int sp = FO(arr, s + 1, ali);
		if (arr[s] == ali) {
			return s;
		} else {
			return sp;
		}
	}

	public static int LO(int[] arr, int s, int ali) {
		if (s == arr.length) {
			return -1;
		}
//		BP  : FO(arr,s,ali)
//		SP  : FO(arr,s+1,ali)

		int sp = LO(arr, s + 1, ali);
		if (sp == -1 && arr[s] == ali) {
			return s;
		} else {
			return sp;
		}
	}
	public static int[] AllOcc(int[] arr, int s, int ali, int count) {
		if(s==arr.length) {
			return new int[count];
		}
		if(arr[s]==ali) {
			int[] sp = AllOcc(arr, s+1, ali, count+1);
			sp[count] = s;
			return sp;
			
		}else {
			int[] sp = AllOcc(arr, s+1, ali, count);	
			return sp;
			
		}
	}
}
