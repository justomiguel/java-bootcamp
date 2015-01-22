package com.firstExercise.tests;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import com.firstExercise.tdd.RomanConverter;

public class RomanTest {

	@Test
	public void Fivetest() {
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
		assertEquals(roman.convertToRoman(5), "V");
	}
	
	@Test
	public void Tentest() {
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
		assertEquals(roman.convertToRoman(10), "X");
	}
	
	@Test
	public void HundredOnetest() {
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
		assertEquals(roman.convertToRoman(101), "CI");
	}
	
	@Test
	public void exceedtest() {
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
		assertEquals(roman.convertToRoman(1000000000), "Number too big!");
	}

}
