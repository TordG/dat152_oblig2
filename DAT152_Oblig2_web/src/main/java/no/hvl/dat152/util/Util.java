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
	
	public static List<WebStoreProduct> convertDescription(List<WebStoreProduct> products, List<Description> descriptions, String langCode) {
		
		products.forEach(product -> {
			product.setDescription(getDescriptionText(descriptions, product.getId(), langCode));
		});
		
		return products;
	}
	
	public static List<WebStoreProduct> convertAllProducts(List<Product> products, List<Description> descriptions, String langCode) {
		List<WebStoreProduct> webStoreProducts = new ArrayList<WebStoreProduct>();
		
		products.forEach(product -> {
			int id = product.getPno();
			String name = product.getpName();
			
			String price = "";
			
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
			
			WebStoreProduct wsp = new WebStoreProduct(id, name, price, description, imageFile);
			
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
