package Lec_23;

public class Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.getName());
		try {
			s1.setAge(13);
			System.out.println(s1.getAge());
			s1.setAge(-20);
			System.out.println(s1.getAge());
			System.out.println("try END");
		} catch (Exception e) {
			System.out.println("milgaya exception!!");
			e.printStackTrace();
			System.err.println("~~~~~~~~~~~~~~~~~" + e.getMessage());
		} finally {
			System.out.println("Finally END");
		}
//		s1.jaaduu();
		System.out.println(s1.getAge());
	}
}
