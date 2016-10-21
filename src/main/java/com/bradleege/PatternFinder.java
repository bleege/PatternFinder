package com.bradleege;

import java.util.HashMap;

public class PatternFinder {

    public PatternFinder() {
        super();
    }

    public boolean doesWordMatchPattern(String pattern, String word) {

        HashMap<Integer, Object> patternChars = new HashMap<Integer, Object>();
        int lengthOfPattern = 0;
        for (int lc = 0; lc < pattern.length(); lc++) {
            char c = pattern.charAt(lc);
            patternChars.put(lc, c);
            if (isCharADigit(c)) {
                lengthOfPattern = lengthOfPattern + Character.getNumericValue(c);
            } else {
                lengthOfPattern = lengthOfPattern + 1;
            }
        }

        if (lengthOfPattern != word.length()) {
            return false;
        }

        for (int lc = 0; lc < word.length(); lc++) {
            if (patternChars.containsKey(lc)) {
                char c = pattern.charAt(lc);
                // Test for Integer
                if (isCharADigit(c)) {

                    // See if digit will make pattern too long for word
                    if (lc + Character.getNumericValue(c) > word.length()) {
                        return false;
                    }
                } else {
                    // Test for char match
                    if (c != word.charAt(lc)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public boolean isCharADigit(char theChar) {
        if (theChar >= '0' && theChar <= '9') {
            return true;
        }
        return false;
    }
}
