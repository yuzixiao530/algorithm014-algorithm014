//
//On a staircase, the i-th step has some non-negative cost cost[i] assigned (0 i
//ndexed).
// 
//Once you pay the cost, you can either climb one or two steps. You need to find
// minimum cost to reach the top of the floor, and you can either start from the s
//tep with index 0, or the step with index 1.
// 
//
// Example 1: 
// 
//Input: cost = [10, 15, 20]
//Output: 15
//Explanation: Cheapest is start on cost[1], pay that cost and go to the top.
// 
// 
//
// Example 2: 
// 
//Input: cost = [1, 100, 1, 1, 1, 100, 1, 1, 100, 1]
//Output: 6
//Explanation: Cheapest is start on cost[0], and only step on 1s, skipping cost[
//3].
// 
// 
//
// Note: 
// 
// cost will have a length in the range [2, 1000]. 
// Every cost[i] will be an integer in the range [0, 999]. 
// 
// Related Topics Array Dynamic Programming 
// 👍 2531 👎 542


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    // dp[i] = Math.min(dp[i-1], dp[i-2])+cost[i];
    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length < 2) return 0;
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[n - 1], dp[n - 2]);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
