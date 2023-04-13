package upes.devops.hons;

import static org.junit.Assert.*;

import org.junit.Test;

import mypkg.MyCalc;

public class MyClacTest {

	@Test
	public void test() {
		MyCalc ob = new MyCalc();
		assertEquals(25, ob.sum(20, 5));
		assertEquals(100, ob.mul(20, 5));
	}

}
