

class Solution {
    // Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1, String s2) {
        // Your code here
         int[] freq1 = new int[256];
        int[] freq2 = new int[256];

        for (char ch : s1.toCharArray()) {
            freq1[ch] = 1;
        }
        for (char ch : s2.toCharArray()) {
            freq2[ch] = 1;
        }

        StringBuilder result = new StringBuilder();

        for (char ch : s1.toCharArray()) {
            if (freq2[ch] == 0) {
                result.append(ch);
            }
        }

        for (char ch : s2.toCharArray()) {
            if (freq1[ch] == 0) {
                result.append(ch);
            }
        }

        return result.length() == 0 ? "-1" : result.toString();
    }
}
