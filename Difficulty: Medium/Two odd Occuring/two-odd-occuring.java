import java.util.*;

class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        int xorAll = 0;
        for (int x : arr) {
            xorAll ^= x;
        }

        // rightmost set bit (mask)
        int rightMost = xorAll & -xorAll;

        int num1 = 0, num2 = 0;
        for (int x : arr) {
            if ((x & rightMost) != 0)
                num1 ^= x;    // belongs to first group
            else
                num2 ^= x;    // belongs to second group
        }

        ArrayList<Integer> ans = new ArrayList<>();
        if (num1 > num2) {
            ans.add(num1);
            ans.add(num2);
        } else {
            ans.add(num2);
            ans.add(num1);
        }
        return ans;
    }
}
