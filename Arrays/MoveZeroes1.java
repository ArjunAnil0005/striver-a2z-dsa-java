public class MoveZeroes1 {
        public static void moveZeroes(int[] nums) {
            int j=0;

            for(int num:nums){
                if(num!=0){
                    nums[j]=num;
                    j++;
                }
            }

            for(int i=j;i<nums.length;i++){
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
