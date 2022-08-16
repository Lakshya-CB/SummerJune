package Lec_23;

public class Student {
	private int Age = 10;
	private String Name = "Sameer";

	public String getName() {
		return Name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) throws Exception {
		if(age<0) {
			throw new Exception("BHAI REHENE DE!");
		}
		Age = age;
	}
	public void jaaduu() {
		throw new RuntimeException("jaaduuu");
	}
}
