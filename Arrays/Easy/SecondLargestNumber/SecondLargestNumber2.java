package SecondLargestNumber;

public class SecondLargestNumber2 {

    public static void seondLargestNumber(int[] nums) {
        
        //Better Approach(pass through the array once)

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        //Time Complexity: O(n)
        //Space Complexity: O(1)
        
        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        seondLargestNumber(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
