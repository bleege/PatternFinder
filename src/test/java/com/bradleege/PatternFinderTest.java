package com.bradleege;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class PatternFinderTest {


    @Test
    public void testDoesWordMatchPattern() {
        PatternFinder patternFinder = new PatternFinder();
        assertNotNull(patternFinder);
        assertTrue(patternFinder.doesWordMatchPattern("pattern", "word"));
    }

}
