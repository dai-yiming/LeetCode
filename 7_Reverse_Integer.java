// Reverse Integer
// https://leetcode.com/problems/reverse-integer/

// // Given a 32-bit signed integer, reverse digits of an integer.

// Examples:
// Input: 123
// Output: 321

// Input: -123
// Output: -321

// Input: 120
// Output: 21

// Note:
// Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

class Solution {
    public int reverse(int x) {

        if (x == 0) {
            return 0; // Case 1: x == 0
        }

        int res = 0;
        int sign = 1;

        if (x < 0) {
            sign = -1;
            x *= sign; // Case 2: Manipulate sign
        }

        while (x > 0) {
            int digit = x % 10; // Last digit
            x /= 10;
            // Test overflow below
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            res = res * 10 + digit;
        }
        // Note to change sign in demand
        return res * sign;
    }
}

// We want to repeatedly "pop" the last digit off of xx and "push" it to the back of the \text{rev}rev. In the end, \text{rev}rev will be the reverse of the xx.
// To "pop" and "push" digits without the help of some auxiliary stack/array, we can use math.
// However, this approach is dangerous, because the statement \text{temp} = \text{rev} \cdot 10 + \text{pop}temp=rev⋅10+pop can cause overflow.
// Luckily, it is easy to check beforehand whether or this statement would cause an overflow.
// max_int = 2147483647 || min_int = -2147483648

// @YIMING DAI - 2019.06.23
