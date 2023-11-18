import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], i);
            }
        }
        return false;
    }

}
