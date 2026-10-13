package TwoSum;

public class TwoSum3 {
    public static void TwoSum(int[] nums, int target) {

        //Brute Force Approach

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("Indices: " + i + ", " + j);
                    return;
                }
            }
        }
        //Time Complexity: O(n^2)
        //Space Complexity: O(1)
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 7, 12};
        int target = 9;
        TwoSum(nums,target);

    }
}
