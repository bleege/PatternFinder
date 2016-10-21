package com.bradleege;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PatternFinderTest {


    @Test
    public void testDoesWordMatchPattern() {
        PatternFinder patternFinder = new PatternFinder();
        assertNotNull(patternFinder);
        assertTrue(patternFinder.doesWordMatchPattern("a3e", "apple"));
        assertFalse(patternFinder.doesWordMatchPattern("a3e", "apples"));
        assertTrue(patternFinder.doesWordMatchPattern("3r", "pear"));
        assertFalse(patternFinder.doesWordMatchPattern("3r", "pears"));
        assertTrue(patternFinder.doesWordMatchPattern("ban3", "banana"));
        assertFalse(patternFinder.doesWordMatchPattern("ban3", "bananas"));
        assertFalse(patternFinder.doesWordMatchPattern("ban", "banana"));
    }
}
