package org.example.Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Longest_Substring_Without_Repeating_Characters {
    public static void  main(String [] arg){
        String test ="dvdf";
        System.out.println(lengthOfLongestSubstring(test));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int[] charIndex = new int[128];
        Arrays.fill(charIndex, -1);
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (charIndex[s.charAt(right)] >= left) {
                left = charIndex[s.charAt(right)] + 1;
            }
            charIndex[s.charAt(right)] = right;
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
