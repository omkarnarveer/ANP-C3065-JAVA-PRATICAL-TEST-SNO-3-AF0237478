public class SumDivisibleNum {
 
    public static void main(String[] args) {
 
        int n = 3;
 
        // Initialize result
        int sum = 0;
 
        // Iterate from 1 to n
        for (int i = 1; i <= n; i++)
            if (i % 3 == 0 || i % 5 == 0)
                sum = sum + i;
 
        System.out.println("Sum of first " + n +
                            " natural numbers which are divisible by 3 or 5 is: " + sum);
    }
}