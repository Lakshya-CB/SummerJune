package Lec_15;

public class String_builder_demo1 {
	public static void main(String[] args) {
		String str = "allo";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		sb.setCharAt(2, 'y');
		System.out.println(sb);
		sb.append("pyaare");
		System.out.println(sb);
		sb.insert(4, " ");// O(n)

		System.out.println(sb);
		sb.deleteCharAt(2);

		System.out.println(sb);
	}
}
