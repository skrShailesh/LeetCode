public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(powerOfTwo(n));
    }

    static boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            } else {
                n = n / 2;
            }
        }
        return true;
    }
}
/*
static boolean powerOfTwo(int n) {
 if (n <= 0) {
            return false;
        }

        // Count the number of set bits in n.
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }

        // A power of two has exactly one set bit.
        return count == 1;
}
}
 */