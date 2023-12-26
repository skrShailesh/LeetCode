public class ClimbingStairs_70 {
    public static void main(String[] args) {
        ClimbingStairs_70 solution = new ClimbingStairs_70();

        // Example 1
        int n1 = 2;
        System.out.println("Example 1 - Input: " + n1 + ", Output: " + solution.climbStairs(n1));

        // Example 2
        int n2 = 3;
        System.out.println("Example 2 - Input: " + n2 + ", Output: " + solution.climbStairs(n2));

        // Additional Test Case
        int n3 = 4;
        System.out.println("Additional Test Case - Input: " + n3 + ", Output: " + solution.climbStairs(n3));
    }

    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
