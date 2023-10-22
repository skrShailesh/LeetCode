public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5}; // Replace this with your array

        // Measure the time complexity for MissingNum method
        long startTime = System.currentTimeMillis();
        int missingNum = MissingNum(nums);
        long endTime = System.currentTimeMillis();

        System.out.println("The missing number is: " + missingNum);
        long executionTime = endTime - startTime;
        System.out.println("Time Complexity for MissingNum: O(n)"); // Time complexity estimation

        // Measure the space complexity for main method
        estimateSpaceComplexity();

        // You can continue analyzing other methods in a similar fashion
    }

    static int MissingNum(int nums[]) {
        int expectedSum = (nums.length + 1) * (nums.length + 2) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missingNum = expectedSum - actualSum;
        return missingNum;
    }

    static void estimateSpaceComplexity() {
        // Estimate space complexity in MB for the main method
        Runtime runtime = Runtime.getRuntime();
        long usedMemoryBytes = runtime.totalMemory() - runtime.freeMemory();
        double usedMemoryMB = usedMemoryBytes / (1024.0 * 1024.0);
        System.out.println("Space Complexity for main method: O(1)"); // Space complexity estimation
        System.out.println("Used memory for main method: " + usedMemoryMB + " MB");
    }

    // Define and analyze other methods as needed
}
