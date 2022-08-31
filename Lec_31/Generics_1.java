package Lec_31;

public class Generics_1 {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		System.out.println(s1);
		Student[] arr = new Student[5];
		arr[0] = new Student("A", 10);
		arr[1] = new Student("B", 12);
		arr[2] = new Student("C", 9);
		arr[3] = new Student("D", 11);
		arr[4] = new Student("E", 1);
		sort(arr);
		disp(arr);
		
	}

//	public static void disp(Object[] arr) {
//		for (Object obj : arr) {
//			System.out.print(obj + " ");
//		}
//		System.out.println();
//	}

	public static <ooo> void disp(ooo[] arr) {
		for (ooo obj : arr) {
			System.out.print(obj + " ");
		}
		System.out.println();

	}

	public static<ooo extends Comparable<ooo>> void sort(ooo[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//				if (arr[s] > arr[s + 1]) {
				if(arr[s].compareTo(arr[s+1])>0) {
					ooo temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
	}
}
