package Lec_37_DP;

import java.util.ArrayList;

public class LIS {
	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
//		System.out.println(solve(arr, 0, Integer.MIN_VALUE));
		System.out.println(solve(arr, 0, -1, new int[arr.length][arr.length + 1]));

	}

	public static int solve(int[] arr, int idx, int previdx, int[][] dp) {
		if (arr.length == idx) {
			return 0;
		}
		if (dp[idx][previdx + 1] != 0) {
			return dp[idx][previdx + 1];
		}
		int sp1 = 0;
		if (previdx == -1 || arr[idx] > arr[previdx]) {
			sp1 = 1 + solve(arr, idx + 1, idx, dp);
		}
		int sp2 = solve(arr, idx + 1, previdx, dp);
		dp[idx][previdx + 1] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);
	}

	public int lengthOfLIS(int[] nums) {
		return solve(nums, 0, -1, new int[nums.length][nums.length + 1]);
	}
	public int lengthOfLIS(int[] arr) {
        ArrayList<Integer> AL = new ArrayList<>();
        for(int ali : arr){
            if(AL.isEmpty() || AL.get(AL.size()-1)<ali){
                AL.add(ali);
            }else{
                int s = 0;
                int e = AL.size()-1;
                int idx = e;
                while(s<=e){
                    int mid = (s+e)/2;
                    if(AL.get(mid)>=ali){
                        idx = mid;
                        e=mid-1;
                    }else{
                        s = mid+1;
                    }
                }
                AL.set(idx,ali);
            }
        }
        return AL.size();
	}

}
