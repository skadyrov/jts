

/*
 * The JTS Topology Suite is a collection of Java classes that
 * implement the fundamental operations required to validate a given
 * geo-spatial data set to a known topological specification.
 * 
 * Copyright (C) 2016 Vivid Solutions
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * (http://www.eclipse.org/legal/epl-v10.html), and the Vivid Solutions BSD
 * License v1.0 (found at the root of the repository).
 * 
 */
package com.vividsolutions.jts.util;

import com.vividsolutions.jts.util.AssertionFailedException;

/**
 *  A utility for making programming assertions.
 *
 *@version 1.7
 */
public class Assert {

  /**
   *  Throws an <code>AssertionFailedException</code> if the given assertion is
   *  not true.
   *
   *@param  assertion                  a condition that is supposed to be true
   *@throws  AssertionFailedException  if the condition is false
   */
  public static void isTrue(boolean assertion) {
    isTrue(assertion, null);
  }

  /**
   *  Throws an <code>AssertionFailedException</code> with the given message if
   *  the given assertion is not true.
   *
   *@param  assertion                  a condition that is supposed to be true
   *@param  message                    a description of the assertion
   *@throws  AssertionFailedException  if the condition is false
   */
  public static void isTrue(boolean assertion, String message) {
    if (!assertion) {
      if (message == null) {
        throw new AssertionFailedException();
      }
      else {
        throw new AssertionFailedException(message);
      }
    }
  }

  /**
   *  Throws an <code>AssertionFailedException</code> if the given objects are
   *  not equal, according to the <code>equals</code> method.
   *
   *@param  expectedValue              the correct value
   *@param  actualValue                the value being checked
   *@throws  AssertionFailedException  if the two objects are not equal
   */
  public static void equals(Object expectedValue, Object actualValue) {
    equals(expectedValue, actualValue, null);
  }

  /**
   *  Throws an <code>AssertionFailedException</code> with the given message if
   *  the given objects are not equal, according to the <code>equals</code>
   *  method.
   *
   *@param  expectedValue              the correct value
   *@param  actualValue                the value being checked
   *@param  message                    a description of the assertion
   *@throws  AssertionFailedException  if the two objects are not equal
   */
  public static void equals(Object expectedValue, Object actualValue, String message) {
    if (!actualValue.equals(expectedValue)) {
      throw new AssertionFailedException("Expected " + expectedValue + " but encountered "
           + actualValue + (message != null ? ": " + message : ""));
    }
  }

  /**
   *  Always throws an <code>AssertionFailedException</code>.
   *
   *@throws  AssertionFailedException  thrown always
   */
  public static void shouldNeverReachHere() {
    shouldNeverReachHere(null);
  }

  /**
   *  Always throws an <code>AssertionFailedException</code> with the given
   *  message.
   *
   *@param  message                    a description of the assertion
   *@throws  AssertionFailedException  thrown always
   */
  public static void shouldNeverReachHere(String message) {
    throw new AssertionFailedException("Should never reach here"
         + (message != null ? ": " + message : ""));
  }
}

