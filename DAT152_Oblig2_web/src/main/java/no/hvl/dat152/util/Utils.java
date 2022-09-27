package no.hvl.dat152.util;

import java.util.HashMap;

public class Utils {
	
	private Utils() {
		//Hei =) Ble du glad naa?
	}
	
	//In NOK
		final static double WHITE_CUP_NOK = 39.99; 
		final static double BLACK_CUP_NOK = 49.99;
	
	
	public static double currencyConverter(String currency, double amount) {
		HashMap<String, Double> currencies = new HashMap<String, Double>();
		currencies.put("NOK", 1.0);
		currencies.put("USD", 0.094);
		currencies.put("EUR", 0.097);
		
		
		return Math.ceil(currencies.get(currency) * amount) -0.01   ;
		
	}

}
