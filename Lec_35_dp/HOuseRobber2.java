package Lec_37_DP;

public class HOuseRobber2 {
	public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int c1 = BU(nums,0,nums.length-2);
        int c2 = BU(nums,1,nums.length-1);
        return Math.max(c1,c2);
    }
    public static int BU(int[] arr,int s, int e) {
		int[] dp = new int[arr.length+2];
		for (int idx = e; idx >= s; idx--) {
//			dp[idx]!!
			int sp1 = arr[idx] + dp[idx + 2];
			int sp2 = dp[idx + 1];
			dp[idx] = Math.max(sp1, sp2);
		}
		return dp[s];
	}
}

