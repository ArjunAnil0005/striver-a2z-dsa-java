package Basics;

import java.util.Arrays;

public class FibanocciSeries3 {
    public static void FibanocciSeries(int nums) {
        
        //Brute Force Approach

        int[] fib = new int[nums];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < nums; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println("Fibonacci series up to " + nums + " terms:");
        System.out.println(Arrays.toString(fib));

        //Time Complexity: O(n)
        //Space Complexity: O(n)
    }

    public static void main(String[] args) {
        int nums = 5;

        FibanocciSeries(nums);

    }
}
