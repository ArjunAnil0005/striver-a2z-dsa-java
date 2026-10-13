package TwoSum;

import java.util.HashMap;

public class TwoSum2 {
    public static void TwoSum(int[] nums, int target) {
        
        //Better Approach using HashMap

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + ", " + i);
                return;
            }
            map.put(nums[i], i);
        }
        //Time Complexity: O(n)
        //Space Complexity: O(n)
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 7, 12};
        int target = 9;
        TwoSum(nums,target);

    }
}
