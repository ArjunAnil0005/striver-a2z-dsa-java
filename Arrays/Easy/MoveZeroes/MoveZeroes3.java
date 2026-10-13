package MoveZeroes;

public class MoveZeroes3 {
    public static void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int index =0;

        // Move all non-zero elements to the front of the array
        for(int num : nums){
            if(num !=0){
                result[index] = num;
                index++;
            }
        }
        // Fill the remaining positions with zeros
        for(int i=index; i<nums.length; i++){
            result[i]=0;
        }

        for(int i=0; i<nums.length; i++){
            nums[i] = result[i];
        }

        //Time Complexity: O(n)
        //Space Complexity: O(n)
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
