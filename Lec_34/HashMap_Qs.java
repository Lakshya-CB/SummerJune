package Lec_34;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap_Qs {
	public static void main(String[] args) {
//		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
//		longestConsSeq(arr);
//		groupAnagram();
		System.out.println(args);
		System.out.println(args.length);
		for(String str: args) {
			System.out.println(str);
		}
	}

	public static void longestConsSeq(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int alo : arr) {
			if (map.containsKey(alo - 1)) {
				map.put(alo, false);
			} else {
				map.put(alo, true);
			}
			if (map.containsKey(alo + 1)) {
				map.put(alo + 1, false);
			}
		}
		System.out.println(map);
		int ans = 0;
		for (int ali : map.keySet()) {
			if (map.get(ali)) {
				int start = ali;
				int size = 0;
				while (map.containsKey(start)) {
//					System.out.print(start+" ");
					start++;
					size++;
				}
//				System.out.println();
				ans = Math.max(ans, size);
			}
		}
		System.out.println(ans);
	}

	public static void groupAnagram() {
		String str = "asagzq";
		char[] arr = str.toCharArray();
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println(freq(str));
	}
	public static String freq(String str) {
		int[] arr = new int[26];
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			arr[ch-'a']++;
		}
		return Arrays.toString(arr);
	}
}
