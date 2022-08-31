package Lec_31;

public class Client {
	public static void main(String[] args) {
		System.out.println(Student.tot_students);
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		System.out.println(s3.tot_students);
		s3.tot_students =0;
		System.out.println(s2.tot_students);
////		System.out.println(Student.tot_students);
		
		
	}
	
}
