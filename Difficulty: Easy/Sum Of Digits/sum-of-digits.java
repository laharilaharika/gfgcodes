class Solution {
    int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10; // add last digit
            num /= 10;       // remove last digit
        }
        return sum;
    }
}
