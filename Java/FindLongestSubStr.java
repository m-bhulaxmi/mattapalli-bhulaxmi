package Java;

import java.util.HashMap;

public class FindLongestSubStr {
        public static int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int maxLength = 0;
            int start = 0;

            for (int end = 0; end < s.length(); end++) {
                char currentChar = s.charAt(end);

                if (map.containsKey(currentChar)) {
                    start = Math.max(map.get(currentChar) + 1, start);
                }

                map.put(currentChar, end);
                maxLength = Math.max(maxLength, end - start + 1);
            }

            return maxLength;
        }

        public static void main(String[] args) {
            String input = "abcabcbb";
            int result = lengthOfLongestSubstring(input);
            System.out.println("Length of longest substring without repeating characters: " + result);
        }
    }
