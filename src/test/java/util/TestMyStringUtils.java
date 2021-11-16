package util;

import util.MyStringUtils;

public class TestMyStringUtils {
	public static void main(String[] args) {
		TestMyStringUtils myTest = new TestMyStringUtils();
		myTest.testIsEmpty();
		myTest.testEqualsStringString();
		myTest.testContainsStringChar();
	}
	
	public void testIsEmpty() {
		MyStringUtils theStringUtils = new MyStringUtils();
		if (theStringUtils.isEmpty("")) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in IsEmpty!");
		}
		
		if (theStringUtils.isEmpty(null)) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in IsEmpty!");
		}
		
		if (!theStringUtils.isEmpty("   ")) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in IsEmpty!");
		}
		
		if (!theStringUtils.isEmpty("   ab")) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in IsEmpty!");
		}
	}
	
	public void testEqualsStringString() {
		MyStringUtils theStringUtils = new MyStringUtils();
		if (theStringUtils.equals(null, null)) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in EqualsStringString!");
		}
		
		if (!theStringUtils.equals(null, "abc")) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in EqualsStringString!");
		}
	}
	
	public void testContainsStringChar() {
		MyStringUtils theStringUtils = new MyStringUtils();
		if (theStringUtils.contains("abc", 'a')) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in ContainsStringChar!");
		}
		
		
		if (!theStringUtils.contains("Abc", 'a')) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in ContainsStringChar!");
		}
	}
}
