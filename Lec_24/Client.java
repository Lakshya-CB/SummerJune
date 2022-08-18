package Lec_24;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
//		case 1:
		Parent p = new Parent();
//		case 2:
		Parent obj = new Child();
		
		System.out.println(obj.data);
		System.out.println(((Child)obj).data);
//		collision of variables is resolved by LHS
		
		obj.fun();
		((Child)obj).fun();
//		case 3:
//		Child obj2 = new Parent(); 
//		case 4:
		Child c= new Child();
		System.out.println(c.data);
		System.out.println(((Parent)c).data);
//		obj.
		System.out.println(obj);
		Object x = new Child();
		ArrayList<Integer> AL=null;
		System.out.println(AL);
	}
}
