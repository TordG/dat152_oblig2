package no.hvl.dat152.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import no.hvl.dat152.db.model.Description;
import no.hvl.dat152.db.model.Product;
import no.hvl.dat152.model.WebStoreProduct;

public class Util {
	
	private Util() {
		// Util class cannot be instantiated
	}
	
	public static List<WebStoreProduct> convertAllProducts(List<Product> products, List<Description> descriptions, String langCode) {
		List<WebStoreProduct> webStoreProducts = new ArrayList<WebStoreProduct>();
		
		products.forEach(product -> {
			String name = product.getpName();
			
			String price = "";
			
			switch (langCode) {
				case "en_US" : price = currencyConverter("USD", product.getPriceInEuro()) + "$";
				case "no_NO" : price = currencyConverter("NOK", product.getPriceInEuro()) + "kr";
				default: price = product.getPriceInEuro() + "€"; 
			}
			
			String description = getDescriptionText(descriptions, product.getPno(), langCode);
			String imageFile = product.getImageFile();
			
			WebStoreProduct wsp = new WebStoreProduct(name, price, description, imageFile);
			
			webStoreProducts.add(wsp);
		});
		
		return webStoreProducts;
	}

	private static String getDescriptionText(List<Description> descriptions, int pno, String langCode) {
		return descriptions.stream()
			.filter(d -> d.getPno() == pno)
			.filter(d2 -> d2.getLangCode().equals(langCode))
			.map(d -> d.getText())
			.collect(Collectors.toList())
			.get(0);
	}
	
	private static double currencyConverter(String currency, double amount) {
		HashMap<String, Double> currencies = new HashMap<String, Double>();
		currencies.put("NOK", 10.46);
		currencies.put("USD", 0.98);
		currencies.put("EUR", 1.00);
		
		
		return Math.ceil(currencies.get(currency) * amount) -0.01   ;
		
	}
}
