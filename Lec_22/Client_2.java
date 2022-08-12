package Lec_22;

public class Client_2 {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.age = 10;
		s1.name = "nashe";

		Student s2 = new Student();
		s2.age = 20;
		s2.name = "bhola";

		System.out.println(s1.name + " - " + s1.age);
		System.out.println(s2.name + " - " + s2.age);
//		Test2(s1, s2);
		int myAge = 50;
		String myName = "smackiya";
		Test3(s1, s2.name, s2.age, myAge, myName);
		System.out.println(s1.name + " - " + s1.age);
		System.out.println(s2.name + " - " + s2.age);

	}

	public static void Test3(Student s1, String name, int age, int myAge, String myName) {
		s1.name = "";
		s1.age = 0;

		name = "";
		age = 0;

		myName = "";
		myAge = 0;
	}

	public static void Test1(Student s1, Student s2) {
		Student temp = s1;
		s1 = s2;
		s2 = temp;
	}

	public static void Test2(Student s1, Student s2) {
		s1 = new Student();
		String temp_s = s1.name;
		s1.name = s2.name;
		s2.name = temp_s;

		int temp_i = s1.age;
		s1.age = s2.age;
		s2.age = temp_i;
	}

}
