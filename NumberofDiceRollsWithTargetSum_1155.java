public class NumberofDiceRollsWithTargetSum_1155 {
    public static void main(String[] args) {
        int n = 1, k = 6, target = 3;
        NumberofDiceRollsWithTargetSum_1155 check = new NumberofDiceRollsWithTargetSum_1155();
        int n1 = 1, k1 = 6, target1 = 3;
        System.out.println(check.numRollsToTarget(n1, k1, target1)); // Output: 1

        // Example 2
        int n2 = 2, k2 = 6, target2 = 7;
        System.out.println(check.numRollsToTarget(n2, k2, target2)); // Output: 6

        // Example 3
        int n3 = 30, k3 = 30, target3 = 500;
        System.out.println(check.numRollsToTarget(n3, k3, target3)); // Output: 222616187

    }

    public int numRollsToTarget(int n, int k, int target) {
        int mod = (int) 1e9 + 7;
        int[][] dp = new int[n + 1][target + 1];
        dp[0][0] = 1;
        for (int dice = 1; dice <= n; dice++) {
            for (int val = 0; val <= target; val++) {
                for (int face = 1; face <= k; face++) {
                    if (val < face) {
                        continue;
                    }
                    dp[dice][val] = (dp[dice][val] + dp[dice - 1][val - face]) % mod;
                }
            }
        }
        return dp[n][target];
    }

}
