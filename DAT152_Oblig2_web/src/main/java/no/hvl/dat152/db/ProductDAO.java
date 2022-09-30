package no.hvl.dat152.db;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import no.hvl.dat152.db.model.Description;
import no.hvl.dat152.db.model.Product;

public class ProductDAO {
	
	private List<Product> products = new ArrayList<Product>();
	private List<Description> descriptions = new ArrayList<Description>();
	
	public ProductDAO() {
		Product whiteCup = new Product(0, "White Coffee Cup™", 6.50, "images/whitecup.png");
		Product blackCup = new Product(1, "Black Coffee Cup™", 4.75, "images/blackcup.png");
		
		products.add(whiteCup);
		products.add(blackCup);
		
		Description englishWhiteCupDescription = new  Description(0, "en_US", "A great white cup!");
		Description norwegianWhiteCupDescription = new  Description(0, "no_NO", "En flott hvit kopp!");
		Description germanWhiteCupDescription = new  Description(0, "de_DE", "Eine tolle weiße Tasse!");
		
		Description englishBlackCupDescription = new  Description(1, "en_US", "A great black cup!");
		Description norwegianBlackCupDescription = new  Description(1, "no_NO", "En flott svart kopp!");
		Description germanBlackCupDescription = new  Description(1, "de_DE", "Eine tolle schwarze Tasse!");
		
		descriptions.add(englishWhiteCupDescription);
		descriptions.add(norwegianWhiteCupDescription);
		descriptions.add(germanWhiteCupDescription);
		descriptions.add(englishBlackCupDescription);
		descriptions.add(norwegianBlackCupDescription);
		descriptions.add(germanBlackCupDescription);
	}

	public List<Product> getAllProducts() {
		return products;
	}
	
	public List<Description> getAllDescriptions() {
		return descriptions;
	}
}
