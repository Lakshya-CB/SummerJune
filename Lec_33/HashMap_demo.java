package Lec_33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMap_demo {
	public static void main(String[] args) {
//		<Key, Value>
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 10); //O(1)
		map.put("B", 11);
		map.put("C", 170);
		map.put("D", 910);
		map.put("E091", 420);
		
		System.out.println(map.get("D")); //O(1)
		System.out.println(map.get("e091"));
		
		System.out.println(map);
		System.out.println("=========");
		
		map.put("A",null);
		map.remove("D");//O(1)
		
		System.out.println(map);
		
		System.out.println(map.containsKey("A"));
		
		
		System.out.println(map.size());
		
//		System.out.println(map.keySet());
		Set<String> Keys  = map.keySet();
		
		ArrayList<String> AL = new ArrayList<>(Keys);
		System.out.println(AL);
		for(String Key : Keys) {
			System.out.println(Key+"=>"+map.get(Key));
		}
		

	}
}
