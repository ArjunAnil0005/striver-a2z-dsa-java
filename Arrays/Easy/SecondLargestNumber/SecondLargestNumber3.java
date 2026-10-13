package SecondLargestNumber;

import java.util.Arrays;

public class SecondLargestNumber3 {
    public static void seondLargestNumber(int[] nums) {
        
        //Brute Force Approach(pass through the array once)

        Arrays.sort(nums);
        int largest = nums[nums.length - 1];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != largest) {
                secondLargest = nums[i];
                break;
            }
        }

        //Time Complexity: O(nlogn)
        //Space Complexity: O(1)
        
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        seondLargestNumber(nums);

    }
}
