package Lec_31_32;

import java.util.Comparator;

public class Generics_1 {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		System.out.println(s1);
		Student[] arr = new Student[5];
		arr[0] = new Student("cza", 10);
		arr[1] = new Student("123b", 12);
		arr[2] = new Student("ec", 9);
		arr[3] = new Student("da", 11);
		arr[4] = new Student("exz", 1);
		sort(arr, new comName());
		disp(arr);
		
	}
	static class comAge implements Comparator<Student>{

		@Override
		public int compare(Student A, Student B) {
			// TODO Auto-generated method stub
//			A-B
			return A.Age - B.Age;
		}
		
	}
	static class comName implements Comparator<Student>{

		@Override
		public int compare(Student A, Student B) {
			// TODO Auto-generated method stub
//			A-B
			return A.Name.compareTo(B.Name);
		}
		
	}
	public static void disp(Object[] arr) {
		for (Object obj : arr) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

//	public static <ooo> void disp(ooo[] arr) {
//		for (ooo obj : arr) {
//			System.out.print(obj + " ");
//		}
//		System.out.println();
//
//	}

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
	public static<ooo> void sort(ooo[] arr, Comparator<ooo> comp) {
		for (int count = 1; count < arr.length; count++) {
			for (int s = 0; s <= arr.length - 2; s++) {
//				if (arr[s] > arr[s + 1]) {
//				if(arr[s].compareTo(arr[s+1])>0) {
				if(comp.compare(arr[s],arr[s+1])>0) {
					ooo temp = arr[s];
					arr[s] = arr[s + 1];
					arr[s + 1] = temp;
				}
			}
		}
	}
}
