public class MoveZeroes1 {
        public static void moveZeroes(int[] nums) {
            int index=0;

            // Move all non-zero elements to the front of the array
            for(int num : nums){
                if(num != 0){
                    nums[index] = num;
                    index++;
                }
            }

            // Fill the remaining positions with zeros
            for(int i=index; i<nums.length; i++){
                nums[i]=0;
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
