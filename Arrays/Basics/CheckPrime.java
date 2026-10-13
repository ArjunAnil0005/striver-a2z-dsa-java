package Basics;

public class CheckPrime {
    public static void CheckPrime2(int nums) {
        
        //Brute Force Approach

        boolean isPrime = true;
        if (nums <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(nums); i++) {
                if (nums % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(nums + " is " + (isPrime ? "a prime number" : "not a prime number"));
    }

    public static void main(String[] args) {
        int nums = 5;

        CheckPrime2(nums);

    }
}
