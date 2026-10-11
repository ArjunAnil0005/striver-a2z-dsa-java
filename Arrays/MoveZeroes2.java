
public class MoveZeroes2 {
    public static void moveZeroes(int[] nums) {
        int index = 0;

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;

                index++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
