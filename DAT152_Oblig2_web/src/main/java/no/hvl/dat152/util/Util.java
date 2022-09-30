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
	
	private static String lastCurrency = "";
	
	public static List<WebStoreProduct> convertDescription(List<WebStoreProduct> products, List<Description> descriptions, String langCode) {
		
		products.forEach(product -> {
			product.setDescription(getDescriptionText(descriptions, product.getId(), langCode));
		});
		
		return products;
	}
	
	public static List<WebStoreProduct> convertPrice(List<WebStoreProduct> products, String langCode) {
		
			
			String currency = "";
			switch (langCode) {
				case "en_US" : currency = "USD"; 
				break;
				case "no_NO" : currency = "NOK"; 
				break;
				case "de_DE" : currency = "EUR"; 
				break;
				default: currency = "EUR"; 
			}
			
			if(currency.equals(lastCurrency)) {
				return products;
			}
			
			lastCurrency = currency;
			
			final String fcurrency = currency;
		if(currency.equals("EUR")) {
			products.forEach(product -> {
				product.setPrice(product.getEuroPrice() + "");
			});
		} else {
			products.forEach(product -> {
				product.setPrice(currencyConverter(fcurrency, Double.parseDouble(product.getPrice())));
			});
		}	
		return products;
			
	}
	
	public static List<WebStoreProduct> convertAllProducts(List<Product> products, List<Description> descriptions, String langCode) {
		List<WebStoreProduct> webStoreProducts = new ArrayList<WebStoreProduct>();
		
		products.forEach(product -> {
			int id = product.getPno();
			String name = product.getpName();
			
			String price = "";
			Double euroPrice = product.getPriceInEuro();
			
			switch (langCode) {
				case "en_US" : price = currencyConverter("USD", product.getPriceInEuro());
				break;
				case "no_NO" : price = currencyConverter("NOK", product.getPriceInEuro());
				break;
				case "de_DE" : price = currencyConverter("EUR", product.getPriceInEuro());
				break;
				default: price = currencyConverter("EUR", product.getPriceInEuro()); 
			}
			
			String description = getDescriptionText(descriptions, product.getPno(), langCode);
			String imageFile = product.getImageFile();
			
			WebStoreProduct wsp = new WebStoreProduct(id, name, price, description, imageFile, euroPrice);
			
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
	
	private static String currencyConverter(String currency, double amount) {
		HashMap<String, Double> currencies = new HashMap<String, Double>();
		currencies.put("NOK", 10.46);
		currencies.put("USD", 0.98);
		currencies.put("EUR", 1.00);
		
		
		return String.format("%.2f", (currencies.get(currency) * amount));
		
	}
}
