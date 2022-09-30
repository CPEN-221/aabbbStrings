package aabbbstrings;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AABBBStringsTests {
    @Test
    public void test0() {
        assertEquals(0, AABBBStrings.countStrings(0));
    }

	@Test
	public void test1() {
		assertEquals(0, AABBBStrings.countStrings(1));
	}

    @Test
    public void test2() {
        assertEquals(1, AABBBStrings.countStrings(2));
    }

	@Test
	public void test3() {
		assertEquals(1, AABBBStrings.countStrings(3));
	}

	@Test
	public void test4() {
		assertEquals(1, AABBBStrings.countStrings(4));
	}


    @Test
    public void test5() {
        assertEquals(2, AABBBStrings.countStrings(5));
    }

    @Test
    public void test12() {
        assertEquals(12, AABBBStrings.countStrings(12));
    }

    @Test
    public void test19() {
        assertEquals(86, AABBBStrings.countStrings(19));
    }

    @Test
    public void test22() {
        assertEquals(200, AABBBStrings.countStrings(22));
    }

    @Test
    public void test32() {
        assertEquals(3329, AABBBStrings.countStrings(32));
    }


    @Test
    public void test42( ){
        assertEquals(55405, AABBBStrings.countStrings(42) );
    }

    @Test
    public void test47() {
        assertEquals(226030, AABBBStrings.countStrings(47));
    }

	@Test
	public void testWords5() {
		try {
			assertEquals(new HashSet<String>(Arrays.asList("aabbb", "bbbaa")), AABBBStrings.getWords(5));
		}
		catch (TooManyWordsException e) {
			fail("No exception should have been thrown!");
		}
	}

	@Test
	public void testWords7() {
		try {
			assertEquals(new HashSet<String>(Arrays.asList("aaaabbb", "bbbaaaa", "aabbbaa")), AABBBStrings.getWords(5));
		}
		catch (TooManyWordsException e) {
			fail("No exception should have been thrown!");
		}
	}

    @Test
    public void testWords12() {
        try {
            assertEquals(new HashSet<String>(Arrays.asList(
                    "aaaaaaaaaaaa",
                    "bbbbbbbbbbbb",
                    "aaaaaabbbbbb",
                    "bbbbbbaaaaaa",
                    "bbbaaaaaabbb",
                    "aaaabbbbbbaa",
                    "aabbbbbbaaaa",
                    "bbbaabbbaaaa",
                    "aabbbaabbbaa",
                    "bbbaaaabbbaa",
                    "aabbbaaaabbb",
                    "aaaabbbaabbb"
                    )),
                    AABBBStrings.getWords(12));
        }
        catch (TooManyWordsException e) {
            fail("No exception should have been thrown!");
        }
    }

    @Test
    public void testWords36() {
        try {
            AABBBStrings.getWords(36);
            fail("We should have seen an exception!");
        }
        catch(TooManyWordsException e) {
            // yes, an exception was generated
            assertTrue(true);
        }
    }
}
