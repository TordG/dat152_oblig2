package pakke;


import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;


public class StoreFront {

	//In NOK
	final static double WHITE_CUP_NOK = 39.99; 
	final static double BLACK_CUP_NOK = 49.99; 
	
	
	
	
	
	public static double currencyConverter(String currency, double amount) {
		HashMap<String, Double> currencies = new HashMap<String, Double>();
		currencies.put("NOK", 1.0);
		currencies.put("USD", 0.094);
		currencies.put("EUR", 0.097);
		
		
		return Math.ceil(currencies.get(currency) * amount) -0.01   ;
		
	}

	public static void main(String[] args) {
		
		
		
		
//		Locale locale = new Locale("no");
//         Locale locale = new Locale("de");
        Locale locale = new Locale("en", "US");
		 ResourceBundle apptexts = ResourceBundle.getBundle("resources/apptexts", locale);
		
		System.out.println(apptexts.getString("greeting")); //Hello welcome
		System.out.println(apptexts.getString("whichCup")); //What cup do you want, choices are:
		double whitePrice = currencyConverter(apptexts.getString("currency"), WHITE_CUP_NOK);
		double blackPrice = currencyConverter(apptexts.getString("currency"), BLACK_CUP_NOK);
		
		System.out.println(apptexts.getString("white") + " " + apptexts.getString("currencySymbol") + whitePrice + ", " + apptexts.getString("black") + " " + apptexts.getString("currencySymbol") + blackPrice);
		
		
		Scanner keyboard = new Scanner(System.in);
        String cupChoice = keyboard.nextLine();
        
        double costFactor;
        
        //Midlertidig løsning
        if (cupChoice.equals("1")) {
        	costFactor = whitePrice;
        }else {
        		costFactor = blackPrice;
			}
		
		System.out.println();
		
		System.out.println(apptexts.getString("quantity")); //How many cups do you want
		int quantity = keyboard.nextInt();
		
		keyboard.close();
		System.out.println(apptexts.getString("total")+" "+ apptexts.getString("currencySymbol") + quantity*costFactor); //Your total will be ....

	}

}
