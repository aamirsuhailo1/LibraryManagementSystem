/**
 * 
 */
package com.aamirsuhail;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author aamirsuhail01@yahoo.com
 *
 */
public class LibraryRegressionTests {
	
	@Test
	public void libraryRegressionTestOne() {
		System.out.println("This is library regression test one");
		Assert.assertTrue(true);
	}
	
	@Test
	public void libraryRegressionTestTwo() {
		System.out.println("This is library regression test two");
		Assert.assertTrue(true);
	}
	
	@Test
	public void libraryRegressionTestThree() {
		System.out.println("This is library regression test three");
		Assert.assertTrue(true);
	}
	
	@Test
	public void libraryRegressionTestFour() {
		System.out.println("This is library regression test four");
		Assert.assertTrue(true);
	}
	
	@Test
	public void libraryRegressionTestFive() {
		System.out.println("This is library regression test five");
		Assert.assertTrue(false);
	}
	
	@Test
	public void libraryRegressionTestSix() {
		System.out.println("This is library regression test six");
		Assert.assertTrue(true);
	}

}
