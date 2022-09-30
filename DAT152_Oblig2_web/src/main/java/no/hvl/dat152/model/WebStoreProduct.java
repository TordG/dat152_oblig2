package no.hvl.dat152.model;

import java.util.Objects;

public class WebStoreProduct {
	
	private int id;
	private String name;
	private String price;
	private String description;
	private String imageFile;
	private final double euroPrice;
	
	public WebStoreProduct(int id, String name, String price, String description, String imageFile, Double euroPrice) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageFile = imageFile;
		this.euroPrice = euroPrice;
	}

	public String getName() {
		return name;
	}
	
	public double getEuroPrice() {
		return euroPrice;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String blablabla) {
		this.price = blablabla;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String blablabla) {
		this.description = blablabla;
	}
	
	public String getImageFile() {
		return imageFile;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "WebStoreProduct [name=" + name + ", price=" + price + ", description=" + description + ", imageFile="
				+ imageFile + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WebStoreProduct other = (WebStoreProduct) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	

}
