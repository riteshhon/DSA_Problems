package java;

class PalindromeNumber {
    public void main(String[] args) {
        isPalindrome(10);
    }

    // LeetCode palindrome number question

    public boolean isPalindrome(int x) {
        int rev = 0, digit = 0;
        int val = x;

        while (x != 0) {
            // get last digit of num by using below logic
            digit = x % 10;

            // saving last digit in reverse order
            rev = rev * 10 + digit;

            x /= 10;
        }

        // (-) number will must return false
        if (val == x && val >= 0) {
            return true;
        } else {
            return false;
        }
    }
}