package Lec_33;

import java.util.HashMap;

public class HashMap_Qs {
	public static void main(String[] args) {
		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };

		inter(arr1, arr2);
	}

	public static void inter(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int aloo : arr2) {
//			if (map.containsKey(aloo)) {
//				int prev = map.get(aloo);
//				map.put(aloo, prev + 1);
//			} else {
//				map.put(aloo, 1);
//			}
			int prev = map.getOrDefault(aloo, 0);
			map.put(aloo, prev+1);
		}
		System.out.println(map);
		for (int i = 0; i < arr1.length; i++) {
			if (map.containsKey(arr1[i]) && map.get(arr1[i]) > 0) {
//			if( map.get(arr1[i])>0 && map.containsKey(arr1[i])) {
				int prev = map.get(arr1[i]);
				map.put(arr1[i], prev - 1);
				System.out.println(arr1[i]);
			}
		}
		System.out.println(map);
	}
}
