import java.util.*;

class Solution {
    public static List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new StringBuilder(), result);
        Collections.sort(result);     // lexicographic order
        return result;
    }

    private static void backtrack(String s, int idx, StringBuilder current, List<String> result) {
        // Base case: reached end of string
        if (idx == s.length()) {
            if (current.length() > 0)  // skip empty subsequence
                result.add(current.toString());
            return;
        }

        // Choice 1: include s.charAt(idx)
        current.append(s.charAt(idx));
        backtrack(s, idx + 1, current, result);
        current.deleteCharAt(current.length() - 1);  // backtrack

        // Choice 2: exclude s.charAt(idx)
        backtrack(s, idx + 1, current, result);
    }
}
