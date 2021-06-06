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
public class LibrarySanityTests {
	
	@Test
	public void librarySanityTestOne() {
		System.out.println("This is library sanity test one");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySanityTestTwo() {
		System.out.println("This is library sanity test two");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySanityTestThree() {
		System.out.println("This is library sanity test three");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySanityTestFour() {
		System.out.println("This is library sanity test four");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySanityTestFive() {
		System.out.println("This is library sanity test five");
		Assert.assertTrue(true);
	}
	
	@Test
	public void librarySanityTestSix() {
		System.out.println("This is library sanity test six");
		Assert.assertTrue(false);
	}

}
