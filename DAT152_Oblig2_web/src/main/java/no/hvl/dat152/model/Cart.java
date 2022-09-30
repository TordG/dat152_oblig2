package no.hvl.dat152.model;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat152.db.model.Product;

public class Cart {
	
	private List<Product> products;

	public Cart() {
		this.products = new ArrayList<Product>();
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
	public void removeProduct(Product product) {
		products.remove(product);
	}
	public List<Product> getAll() {
		return products;
	}
	
	
	
	
	
	
	
	

}




