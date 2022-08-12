package Lec_22;

public class Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(s1.name);
		System.out.println(s1.age);
		Student s2 = s1;
		s2.age = 99;
		System.out.println(s1.age);
		
	}
}
