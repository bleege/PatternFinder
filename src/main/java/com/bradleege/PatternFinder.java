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
            if (c >= '0' && c <= '9') {
                lengthOfPattern = lengthOfPattern + Character.getNumericValue(c);
            } else {
                lengthOfPattern = lengthOfPattern + 1;
            }
        }

        if (lengthOfPattern != word.length()) {
            return false;
        }

        return true;
    }

}
