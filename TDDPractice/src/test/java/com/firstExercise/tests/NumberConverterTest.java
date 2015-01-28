package com.firstExercise.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.firstExercise.tdd.NumberConverter;

public class NumberConverterTest {

	@Test
	public void checkIfiNumberOneOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals("One dollars", converter.transformNumberToDollars(1));
	}
	
	@Test
	public void checkIfiNumberTenOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals("Ten dollars", converter.transformNumberToDollars(10));
	}
	
	@Test
	public void checkIfiNumberHoundredOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals( "One Hundred dollars", converter.transformNumberToDollars(100));
	}
	
	@Test
	public void checkIfiNumberThousandAndTwoOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals("One Thousand Two dollars", converter.transformNumberToDollars(1002));
	}
	
	@Test
	public void checkIfMoreDecimals() {
		NumberConverter converter = new NumberConverter();
		assertEquals("Has more decimal numbers than permitted", converter.transformNumberToDollars(1002.999));
	}
	
	@Test
	public void checkStrangeParameter() {
		NumberConverter converter = new NumberConverter();
		assertEquals("One Hundred Twenty Three dollars", converter.transformNumberToDollars(123.));
	}
	
	
	@Test
	public void CheckDecimals() {
		NumberConverter converter = new NumberConverter();
		assertEquals("One Thousand Two 99\\100 dollars", converter.transformNumberToDollars(1002.99));
	}

}
