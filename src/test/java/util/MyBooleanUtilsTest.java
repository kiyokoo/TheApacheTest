package util;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyBooleanUtilsTest {

	@Test
	public void testToBooleanIntIntInt() {
		MyBooleanUtils theBooleanUtils = new MyBooleanUtils();
		assertTrue(theBooleanUtils.toBoolean(1, 1, 0));
		assertFalse(theBooleanUtils.toBoolean(0, 1, 0));
		assertTrue(theBooleanUtils.toBoolean(2, 2, 1));
		assertFalse(theBooleanUtils.toBoolean(2, 1, 2));
	}

	@Test
	public void testToBooleanObjectString() {
		MyBooleanUtils theBooleanUtils = new MyBooleanUtils();
		assertTrue(theBooleanUtils.toBooleanObject("y"));
		assertTrue(theBooleanUtils.toBooleanObject("Y"));
		assertTrue(theBooleanUtils.toBooleanObject("t"));
		assertTrue(theBooleanUtils.toBooleanObject("on"));
		assertTrue(theBooleanUtils.toBooleanObject("oN"));
		assertTrue(theBooleanUtils.toBooleanObject("yes"));
		assertTrue(theBooleanUtils.toBooleanObject("yeS"));
		assertTrue(theBooleanUtils.toBooleanObject("true"));
		assertTrue(theBooleanUtils.toBooleanObject("TruE"));
		
		assertFalse(theBooleanUtils.toBooleanObject("n"));
		assertFalse(theBooleanUtils.toBooleanObject("N"));
		assertFalse(theBooleanUtils.toBooleanObject("f"));
		assertFalse(theBooleanUtils.toBooleanObject("No"));
		assertFalse(theBooleanUtils.toBooleanObject("oFf"));
		assertFalse(theBooleanUtils.toBooleanObject("false"));
		assertFalse(theBooleanUtils.toBooleanObject("FaLsE"));
		
		assertEquals(null, theBooleanUtils.toBooleanObject("else"));

	}
}

