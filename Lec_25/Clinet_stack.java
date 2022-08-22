package Lec_25;

public class Clinet_stack {
	public static void main(String[] args) {
		Min_Stack S = new Min_Stack();
		S.add(10);
		S.add(11);
		S.add(8);
		S.add(15);
		S.add(4);
		S.add(7);
		S.add(2);
		S.add(2);
		System.out.println(S.pop()+"-"+S.min);
		System.out.println(S.pop()+"-"+S.min);
		System.out.println(S.pop()+"-"+S.min);
		System.out.println(S.pop()+"-"+S.min);
		System.out.println(S.pop()+"-"+S.min);
		System.out.println(S.pop()+"-"+S.min);
		System.out.println(S.pop()+"-"+S.min);
		
	}
}
