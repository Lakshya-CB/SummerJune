package Lec_22;

public class Client_3 {
	public static void main(String[] args) {
		Student s3 = new Student();
		System.out.println(s3.name);
		s3.name = "A";
		s3.age = 10;
		s3.Intro();
		System.out.println("===========");
		System.out.println(s3);
		
		Student s4 = new Student();
		s4.name = "B";
		s4.age = 20;
		
		s3.Slaps(s4);
		s3.Slaps("B");
	}
}
