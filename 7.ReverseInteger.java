// Given a signed 32-bit integer x, return x with its digits reversed. 
// If reversing x causes the value to go outside the signed 32-bit integer range 
// [-231, 231 - 1], then return 0.

class Solution {
    public int reverse(int x) {
        long digit = 0;

        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;

            digit = digit * 10 + lastDigit;
        }

        if (digit > Integer.MAX_VALUE || digit < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) digit;
    }
}