package com.leetcode.quastions.LongestSubstringWithoutRepeatingCharacters;

import sun.security.util.Length;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int flagS=0, flagE=0, maxLength=0;
        char[] arrS= s.toCharArray();
        boolean found;
        while(flagE<arrS.length) {
            found = false;
            for (int i = flagS; !found & i < flagE; i++) {
                if (arrS[i] == arrS[flagE]) {
                    found = true;
                    flagS = i + 1;
                }
            }
            flagE++;
            maxLength = Math.max(maxLength, flagE - flagS);
        }
        return maxLength;
    }
}
