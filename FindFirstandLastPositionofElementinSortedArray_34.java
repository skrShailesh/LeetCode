public class FindFirstandLastPositionofElementinSortedArray_34 {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = arr[1] = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = 1;
                while (i < nums.length && nums[i + 1] == target) {
                    i++;
                    arr[1] = i;
                    break;
                }
            }
        }
        return arr;
    }
}
