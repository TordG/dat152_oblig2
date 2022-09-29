package no.hvl.dat152.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cup {

	private String desc;
	private String url;
	private String name;

	private double price;

	public Cup(String desc, String url, String name, double price) {
		this.desc = desc;
		this.url = url;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getUrl() {
		return url;
	}

	public String getDesc() {
		return desc;
	}

	@Override
	public String toString() {
		return "Cup [name=" + name + ", price=" + price + "]";
	}

}
