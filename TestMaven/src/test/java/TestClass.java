/**
 * <copyright>
 * 
 * Copyright (c) XXX GmbH and others.
 * All rights reserved. This program and the accompanying materials are made
 * available for XXX GmbH and associated companies internal use only
 * 
 * Contributors:
 *     XXX GmbH - Initial API and implementation
 * 
 * </copyright>
 */

package test.java;

import static org.junit.Assert.assertEquals;

import main.java.TestSomething;

import org.junit.Test;

/**
 * @author aadavani
 *
 */
public class TestClass {
  @Test
  public void test() {
    assertEquals(1, TestSomething.returnSomething());
  }
}
