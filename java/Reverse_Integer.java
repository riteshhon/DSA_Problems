package java;

class Reverse_Integer {
    public static void main(String[] args) {
        int x = 1534236469;
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            System.out.println(rev);
            x /= 10;
        }
    }

}
