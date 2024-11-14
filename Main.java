public static boolean isPrime(int N) {
    // 1 is not a prime number
    if (N == 1) {
        return false;
    }

    // 2 is the only even prime number
    if (N == 2) {
        return true;
    }

    // Any even number greater than 2 is not prime
    if (N % 2 == 0) {
        return false;
    }

    // Check from 3 up to the square root of N, skipping even numbers
    for (int i = 3; i <= Math.sqrt(N); i += 2) {
        if (N % i == 0) {
            return false;
        }
    }

    // If no divisors were found, it's prime
    return true;
}
