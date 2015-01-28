package com.firstExercise.tests;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import com.firstExercise.tdd.RomanConverter;

public class RomanTest {

	@Test
	public void testfive() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "X");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		RomanConverter roman = new RomanConverter(map);
		assertEquals("V",roman.convertToRoman(5));
	}
	
	@Test
	public void testTen() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "X");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		RomanConverter roman = new RomanConverter(map);
		assertEquals("X",roman.convertToRoman(10));
	}
	
	@Test
	public void testundredOne() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "X");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		RomanConverter roman = new RomanConverter(map);
		assertEquals("CI", roman.convertToRoman(101));
	}
	
	@Test
	public void tesexceedt() {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "X");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");
		RomanConverter roman = new RomanConverter(map);
		assertEquals("Number too big!", roman.convertToRoman(1000000000));
	}

}
