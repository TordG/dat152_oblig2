package no.hvl.dat152.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cup {

	private String desc;
	private String url;
	private String color;

	private double price;

	public Cup(String desc, String url, String color, double price) {
		this.desc = desc;
		this.url = url;
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public double getPrice() {
		return price;
	}

	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "Cup [color=" + color + ", price=" + price + "]";
	}

}
