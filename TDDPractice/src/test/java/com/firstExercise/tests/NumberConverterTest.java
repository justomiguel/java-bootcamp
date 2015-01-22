package com.firstExercise.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.firstExercise.tdd.NumberConverter;

public class NumberConverterTest {

	@Test
	public void CheckIfiNumberOneOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals(converter.transformNumberToDollars(1), "One dollars");
	}
	
	@Test
	public void CheckIfiNumberTenOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals(converter.transformNumberToDollars(10), "Ten dollars");
	}
	
	@Test
	public void CheckIfiNumberHoundredOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals(converter.transformNumberToDollars(100), "One Hundred dollars");
	}
	
	@Test
	public void CheckIfiNumberThousandAndTwoOk() {
		NumberConverter converter = new NumberConverter();
		assertEquals(converter.transformNumberToDollars(1002), "One Thousand Two dollars");
	}
	
	@Test
	public void CheckIfMoreDecimals() {
		NumberConverter converter = new NumberConverter();
		assertEquals(converter.transformNumberToDollars(1002.999), "Has more decimal numbers than permitted");
	}
	
	@Test
	public void CheckDecimals() {
		NumberConverter converter = new NumberConverter();
		assertEquals(converter.transformNumberToDollars(1002.99), "One Thousand Two 99\\100 dollars");
	}

}
