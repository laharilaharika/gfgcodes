class Solution {
    public static int countBitsFlip(int a, int b) {
        int num = a ^ b;    // XOR to find differing bits
        int count = 0;
        while (num != 0) {
            count++;
            num = num & (num - 1);  // clear the lowest set bit
        }
        return count;
    }
}
