package longestCommonPrefix;

import java.util.Arrays;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int minLength = Math.min(first.length(), last.length());

        int i = 0;
        while (i < minLength && first.charAt(i) == last.charAt(i)){
            i++;
        }

        return first.substring(0, i);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] input = {"flower", "flow", "flight"};
        String result = solution.longestCommonPrefix(input);

        String[] input2 = {"dog","racecar","car"};
        String result2 = solution.longestCommonPrefix(input2);

        System.out.println("Resultado: " + result);
        System.out.println("Resultado2: " + result2);
    }
}
