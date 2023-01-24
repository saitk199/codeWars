package Examples;

import java.math.BigInteger;

import static java.lang.Math.sqrt;

public class IsNumberPrime {
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        double d = sqrt(num);
        for (int i = 2; i <= d; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime1(int num) {
        return num > 1 && BigInteger.valueOf((long) num).isProbablePrime(20);
    }
}
