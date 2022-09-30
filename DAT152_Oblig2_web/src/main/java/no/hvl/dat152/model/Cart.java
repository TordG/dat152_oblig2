package no.hvl.dat152.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cart {
	
	public static List<WebStoreProduct> staticItems = new ArrayList<WebStoreProduct>();

	private List<WebStoreProduct> products;

	public Cart() {
		this.products = staticItems;
	}
	
	public void addItem(WebStoreProduct item) {
		products.add(item);
	}
	
	public void removeProduct(WebStoreProduct item) {
		products.remove(item);
	}
	
	public List<WebStoreProduct> getAllItems() {
		return products;
	}
	
	public List<WebStoreProduct> getIndividualItems() {
		Set<WebStoreProduct> set = new HashSet<WebStoreProduct>();
		
		products.forEach(product -> set.add(product));
		return set.stream().collect(Collectors.toList());
	}
	
	public int getAmount(WebStoreProduct item) {
		return (int) products.stream().filter(i -> i.getName().equals(item.getName())).count();
	}
	
	public String getItemTotal(WebStoreProduct item) {
		return String.format("%.2f", getAmount(item) * Double.parseDouble(item.getPrice()));
	}
	
	
	public String getTotal() {
		return String.format("%.2f", 
				products.stream()
				.map(wbs -> wbs.getPrice())
				.map(price -> Double.parseDouble(price))
				.reduce(0.00, Double::sum)
		);
	}
	
	
	
	
	
	
	
	

}




