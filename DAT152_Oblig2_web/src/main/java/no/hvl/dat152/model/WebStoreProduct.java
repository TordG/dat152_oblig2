package no.hvl.dat152.model;

import java.util.Objects;

public class WebStoreProduct {
	
	private int id;
	private String name;
	private String price;
	private String description;
	private String imageFile;
	
	public WebStoreProduct(int id, String name, String price, String description, String imageFile) {
		this.id = id;
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
