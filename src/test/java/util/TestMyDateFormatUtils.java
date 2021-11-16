package util;

import java.util.Date;
import java.util.TimeZone;

import util.MyDateFormatUtils;

public class TestMyDateFormatUtils {
	public static void main(String[] args) {
		TestMyDateFormatUtils myTest = new TestMyDateFormatUtils();
		myTest.testformatmillis();
	}
	public void testformatmillis() {
		MyDateFormatUtils myformat = new MyDateFormatUtils();
		long themillis=2000000;
		String thepattern="HH:mm:ssZZ";
		String expect= "08:33:20+08:00";
		if (expect.equals(myformat.format(themillis, thepattern))) {
			System.out.println("OK!");
		}
		else {
			System.err.println("Error in format!");
		}
	}
}
