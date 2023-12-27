public class MinimumTimetoMakeRopeColorfulMedium_1578 {
    public static void main(String[] args) {
        MinimumTimetoMakeRopeColorfulMedium_1578 solution = new MinimumTimetoMakeRopeColorfulMedium_1578();

        // Example 1
        String colors1 = "abaac";
        int[] neededTime1 = {1, 2, 3, 4, 5};
        System.out.println("Example 1: " + solution.minCost(colors1, neededTime1));

        // Example 2
        String colors2 = "abc";
        int[] neededTime2 = {1, 2, 3};
        System.out.println("Example 2: " + solution.minCost(colors2, neededTime2));

        // Example 3
        String colors3 = "aabaa";
        int[] neededTime3 = {1, 2, 3, 4, 1};
        System.out.println("Example 3: " + solution.minCost(colors3, neededTime3));
    }

    public int minCost(String colors, int[] neededTime) {
        int prev = 0;
        int ans = 0;
        char arr[] = colors.toCharArray();

        for (int i = 1; i < arr.length; i++) {
            if (arr[prev] != arr[i])
                prev = i;  // Update the previous index to the current index
            else {
                if (neededTime[prev] < neededTime[i]) {
                    ans += neededTime[prev];
                    prev = i;  // Update the previous index to the current index
                } else
                    ans += neededTime[i];
            }
        }
        return ans;
    }
}
