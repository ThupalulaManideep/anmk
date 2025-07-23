public class prime {

    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int i = 2; i <= 100; i++) { // Start from 2 as 1 is not prime
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) { // 0, 1, and negative numbers are not prime
            return false;
        }
        // Check for divisibility from 2 up to the square root of the number
        // This optimizes the check as factors beyond the square root will have a corresponding factor below it.
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
}