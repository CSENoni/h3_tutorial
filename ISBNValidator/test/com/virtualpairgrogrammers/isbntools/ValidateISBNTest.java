package com.virtualpairgrogrammers.isbntools;

import static org.junit.Assert.*;

import org.junit.Test;

import com.virtualpairprogrammers.isbntools.ValidateISBN;

public class ValidateISBNTest {

	@Test
	public void checkAValidISBN() {
		ValidateISBN validator = new ValidateISBN();
		boolean result = validator.checkISBN(1400012332);
		assertTrue(result);
	}

}
