package Lec_31_32;

public class Student {
	static int tot_students=10;
	int Age;
	String Name;
	public static void dange() {
		tot_students =0;
		int ll = 100;
		
	}
	Student(String str, int a) {
		tot_students++;
		Name = str;
		Age = a;
	}
	Student() {
		tot_students++;
	}
	public void baccha() {
		Age = 0;
	}
	@Override 
	public String toString() {
		return "{"+Name +"-"+Age+"}";
	}
//	@Override
	public int compareTo(Student o) {
//		this =A
//		o = B
//		A-B
//		this - o
		
		return this.Age - o.Age;
	}
}
