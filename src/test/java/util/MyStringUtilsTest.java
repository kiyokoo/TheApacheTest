package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MyStringUtilsTest {

	@Test
	public void testIsEmpty() {
		MyStringUtils theStringUtils = new MyStringUtils();
		assertTrue(MyStringUtils.isEmpty(""));
		assertFalse(MyStringUtils.isEmpty("  "));
		assertFalse(MyStringUtils.isEmpty("  ab"));
		assertTrue(MyStringUtils.isEmpty(null));
	}


	@Test
	public void testStripToEmpty() {
		MyStringUtils theStringUtils = new MyStringUtils();
		assertEquals("", MyStringUtils.stripToEmpty(""));
		assertEquals("ab", MyStringUtils.stripToEmpty("ab  "));
		assertEquals("a b c", MyStringUtils.stripToEmpty("  a b c  "));
		assertEquals("", MyStringUtils.stripToEmpty(null));
		assertEquals("abc", MyStringUtils.stripToEmpty("  abc"));
	}

	@Test
	public void testEqualsStringString() {
		MyStringUtils theStringUtils = new MyStringUtils();
		assertTrue(MyStringUtils.equals(null, null));
		assertFalse(MyStringUtils.equals("abc",null));
		assertFalse(MyStringUtils.equals(null,"abc"));
		assertFalse(MyStringUtils.equals("abc","ABC"));
		assertTrue(MyStringUtils.equals("abc","abc"));
		assertFalse(MyStringUtils.equals("abc"," abc"));
	}

	@Test
	public void testContainsStringChar() {
		MyStringUtils theStringUtils = new MyStringUtils();
		assertTrue(MyStringUtils.contains("abc", 'a'));
		assertFalse(MyStringUtils.contains("Abc", 'a'));
		assertFalse(MyStringUtils.contains("abc", 'z'));
		assertFalse(MyStringUtils.contains(null, 'a'));

	}

	@Test
	public void testSubstringStringInt() {
		MyStringUtils theStringUtils = new MyStringUtils();
		assertEquals(null, MyStringUtils.substring(null, 0));
		assertEquals("abcd", MyStringUtils.substring("abcd",0));
		assertEquals("cd", MyStringUtils.substring("abcd",2));
		assertEquals("bcd", MyStringUtils.substring("abcd",-3));
		assertEquals("abcd", MyStringUtils.substring("abcd",-5));	}

}

