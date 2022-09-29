package no.hvl.dat152.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	private List<Cup> cups;

	public Cart() {
		this.cups = new ArrayList<Cup>();
	}
	
	public void addCup(Cup cup) {
		cups.add(cup);
	}
	public void removeCup(Cup cup) {
		cups.remove(cup);
	}
	public List<Cup> getAll() {
		return cups;
	}
	
	
	
	
	
	
	
	

}




