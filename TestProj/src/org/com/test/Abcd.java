package org.com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Abcd {

	public static void main(String[] args) {
		String [] currency = {"SGD", "USD", "INR", "GBP", "AUD", "SGD"};
		System.out.println("Size of array: " + currency.length); 
		List<String> currencyList = Arrays.asList(currency);
		System.out.println(currencyList);
		
		List<String> assetList = new ArrayList();
		String[] asset = {"equity", "stocks", "gold", "foriegn exchange", "fixed income", "futures", "options"};
		Collections.addAll(assetList, asset);
		System.out.println(assetList);
		System.out.println("sumanta");
System.out.println("");

	    }
}

	


