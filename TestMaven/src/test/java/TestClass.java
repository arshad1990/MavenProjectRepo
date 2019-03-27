package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.TestSomething;

public class TestClass {
	@Test
	public void test() {
		assertEquals(1, TestSomething.returnSomething());
	}
}
