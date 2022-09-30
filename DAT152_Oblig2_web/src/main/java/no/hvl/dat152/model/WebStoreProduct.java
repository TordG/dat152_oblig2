package no.hvl.dat152.model;

public class WebStoreProduct {
	
	private String name;
	private String price;
	private String description;
	private String imageFile;
	
	public WebStoreProduct(String name, String price, String description, String imageFile) {
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageFile = imageFile;
	}

	public String getName() {
		return name;
	}

	public String getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}
	
	public String getImageFile() {
		return imageFile;
	}
	
	
	
	

}
