package Lec_10;

public class Binary_saaaaaaarch {
	public static void main(String[] args) {

	}

	public static int Find(int[] arr, int ali) {

		int s = 0;
		int e = arr.length - 1;
		while (s <= e) {
			int mid = (s + e) / 2;
			if (arr[mid] == ali) {
				return mid;
			} else if (arr[mid] < ali) {
				s = mid + 1;
			} else {
				e = mid - 1;
			}
		}
		return -1;
	}

	public int firstBadVersion(int n) {
		int s = 1;
		int e = n;
		int ans = n;
		while (s <= e) {
			int mid = (s - e) / 2 + e;

			if (isBadVersion(mid)) {
				ans = mid;
				e = mid - 1;
			} else {
				s = mid + 1;
			}
		}
		return ans;
	}

}
