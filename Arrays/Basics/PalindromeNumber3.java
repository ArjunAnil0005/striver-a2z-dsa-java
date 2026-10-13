package Basics;

public class PalindromeNumber3 {
        public static void PalindromeNumber(int nums) {
        
        //Brute Force Approach

        int originalNum = nums;
        int reversedNum = 0;
        while (nums != 0) {
            int digit = nums % 10;
            reversedNum = reversedNum * 10 + digit;
            nums /= 10;
        }
        System.out.println(originalNum + " is " + (originalNum == reversedNum ? "a palindrome" : "not a palindrome"));
    }

    public static void main(String[] args) {
        int nums = 515;

        PalindromeNumber(nums);

    }
}
