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
public class LibrarySmokeTests {
	
	@Test
	public void librarySmokeTestOne() {
		System.out.println("This is library smoke test one");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySmokeTestTwo() {
		System.out.println("This is library smoke test two");
		Assert.assertTrue(false);
	}
	
	@Test
	public void librarySmokeTestThree() {
		System.out.println("This is library smoke test three");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySmokeTestFour() {
		System.out.println("This is library smoke test four");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySmokeTestFive() {
		System.out.println("This is library smoke test five");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySmokeTestSix() {
		System.out.println("This is library smoke test six");
		Assert.assertTrue(true);
	}

}
