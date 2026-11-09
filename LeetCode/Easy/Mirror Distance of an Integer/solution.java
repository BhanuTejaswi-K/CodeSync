class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverseNumber(n));
    }
     public static int reverseNumber(int n) {
        int revNum = 0;
        int num = Math.abs(n);
        while (num > 0) {
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        return revNum;
    }

}