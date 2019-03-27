package test.java;

import static org.junit.Assert.assertEquals;

import main.java.TestSomething;
import org.junit.Test;

public class TestClass {
  @Test
  public void test() {
    assertEquals(1, TestSomething.returnSomething());
  }
}
