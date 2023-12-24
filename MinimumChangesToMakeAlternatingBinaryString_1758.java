public class MinimumChangesToMakeAlternatingBinaryString_1758 {
    public int minOperations(String s) {
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '1') cnt1++;
                if (s.charAt(i) == '0') cnt2++;
            } else {
                if (s.charAt(i) == '0') cnt1++;
                if (s.charAt(i) == '1') cnt2++;
            }
        }
        return Math.min(cnt1, cnt2);
    }

    public static void main(String[] args) {
        MinimumChangesToMakeAlternatingBinaryString_1758 solution = new MinimumChangesToMakeAlternatingBinaryString_1758();

        // Example 1
        System.out.println(solution.minOperations("0100")); // Output: 1

        // Example 2
        System.out.println(solution.minOperations("10"));   // Output: 0

        // Example 3
        System.out.println(solution.minOperations("1111")); // Output: 2
    }
}
