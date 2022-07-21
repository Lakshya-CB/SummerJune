package Lec_13;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		System.out.println(AL);
		AL.add(20);

		System.out.println(AL);
		AL.add(30);

		System.out.println(AL);
		AL.add(40);

		System.out.println(AL);
		AL.add(50);

		System.out.println(AL);
		
		System.out.println(AL.size());
		
		AL.add(AL.size(), 900);
		System.out.println(AL);
		
		AL.add(0,-2);
		System.out.println(AL);
		System.out.println(AL.get(3));
		
		AL.set(3,null);
		System.out.println(AL);
		
				
		
	}
}
