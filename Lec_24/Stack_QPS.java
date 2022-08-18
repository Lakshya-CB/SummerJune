package Lec_24;

import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
//		Stack<Integer> S = new Stack<>();
//		S.add(10);
//		S.add(20);
//		S.add(30);
//		S.add(40);
//		S.add(50);
//		System.out.println(S);
//		revPrint(S);
//		revStack(S);
//		System.out.println(S);
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		nextGreaterOrdered(arr);
	}

	public static void revPrint(Stack<Integer> S) {
		if (S.isEmpty()) {
			return;
		}
		int temp = S.pop();
		revPrint(S);
		System.out.println(temp);
		S.add(temp);
	}

	public static void revStack(Stack<Integer> S) {
		Stack<Integer> C = new Stack<Integer>();
		copy(S, C);
		while (!C.isEmpty()) {
			S.add(C.pop());
		}
	}

	public static void copy(Stack<Integer> S, Stack<Integer> C) {
		if (S.isEmpty()) {
			return;
		}
		int temp = S.pop();
		copy(S, C);
//		System.out.println(temp);
//		S.add(temp);
		C.add(temp);
	}

	public static void nextGreater(int[] arr) {
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.add(B);
		}
		while (!S.isEmpty()) {
			int A = S.pop();
			System.out.println(A + "=>" + -1);
		}
	}

	public static void nextGreaterOrdered(int[] arr) {
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		int idx = 0;
		for (int B : arr) {
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B;
				int A = arr[A_idx];
			}
			S.add(idx);
			idx++;
		}
		while (!S.isEmpty()) {
			int A_idx = S.pop();
			ans[A_idx] = -1;
			int A = arr[A_idx];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"=>"+ans[i]);
		}
	}
}
