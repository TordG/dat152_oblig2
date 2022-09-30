package no.hvl.dat152.db.model;

public class Product {

	private int pno;
	private String pName;
	private double priceInEuro;
	private String imageFile;
	
	public Product(int pno, String pName, double priceInEuro, String imageFile) {
		this.pno = pno;
		this.pName = pName;
		this.priceInEuro = priceInEuro;
		this.imageFile = imageFile;
	}

	public int getPno() {
		return pno;
	}

	public String getpName() {
		return pName;
	}

	public double getPriceInEuro() {
		return priceInEuro;
	}

	public String getImageFile() {
		return imageFile;
	}

	@Override
	public String toString() {
		return "Product [pno=" + pno + ", pName=" + pName + ", priceInEuro=" + priceInEuro + ", imageFile=" + imageFile
				+ "]";
	}
	
	

	

}
