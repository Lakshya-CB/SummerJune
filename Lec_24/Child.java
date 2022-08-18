package Lec_24;

public class Child extends Parent{
	int data = 1000;
	int dataC = 2000;
	public void fun() {
		System.out.println("C fun");
	}
	public void funC() {
		System.out.println("C funC");
	}
	@Override
	public String toString() {
		return "pyaree pyaaree pyaare";
	}
}
