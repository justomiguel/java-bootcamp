package com.firstExercise.tdd;

import java.util.TreeMap;

public class RomanConverter {

	private final TreeMap<Integer, String> map;
	
	public RomanConverter(TreeMap<Integer, String> map){
		this.map = map;
	}
	
	public String convertToRoman(int number){
		try{
        	return toRoman(number);
        }
        catch(NumberTooBigException e){
            return "Number too big!";
        }
	}
	
	public String toRoman(int number) throws NumberTooBigException{
    	int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }
	
}
