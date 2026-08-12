package divideTwoIntegers;

/**
 * Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.
 * The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.
 * Return the quotient after dividing dividend by divisor.
 * Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2^31, 2^31 − 1]. For this problem, if the quotient is strictly greater than 2^31 - 1, then return 2^31 - 1, and if the quotient is strictly less than -2^31, then return -2^31.
 */

public class Solution {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) != (divisor < 0);

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        int result = 0;

        while (absDividend >= absDivisor) {
            long temp = absDivisor;
            long multiple = 1;

            while (temp << 1 <= absDividend) {
                temp <<= 1;
                multiple <<= 1;
            }

            absDividend -= temp;
            result += multiple;
        }
        return negative ? -result : result;
    }


    public static void main(String[] args) {
        int x = 5;      // 00000101
        int y = x << 1; // 00001010 = 10
        int z = x << 2; // 00010100 = 20

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        Solution solution = new Solution();
        System.out.println(solution.divide(29, 3));
    }
}
