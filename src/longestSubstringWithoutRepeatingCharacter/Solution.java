package longestSubstringWithoutRepeatingCharacter;

import java.util.HashSet;

/**
 * Given a string s, find the length of the longest substring without duplicate characters.
 */

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> substring = new HashSet<>();
        int left = 0, maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            while (substring.contains(letter)) {
                substring.remove(s.charAt(left));
                left++;
            }
            substring.add(letter);
            maxLength = Math.max(maxLength, substring.size());
        }
        return maxLength;
    }

    public static void main() {
        Solution solution = new Solution();

        String s1 = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s1));
        String s2 = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s2));
        String s3 = "bbbbb";
        System.out.println(solution.lengthOfLongestSubstring(s3));


    }
}
