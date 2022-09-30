package pakke;

import java.time.LocalDate;

public class WatermarkGenerator {
	public static String intToRoman(int num) {
		
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder roman = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			while (num >= values[i]) {
				num = num - values[i];
				roman.append(romanLetters[i]);
			}
		}
		return roman.toString();
	}
	
	public static String watermarkify(int start, int now,  String org) {
		return "© " + intToRoman(start) + "-" + intToRoman(now) + " " + org; 
	}
	

	public static void main(String[] args) {
		System.out.println(watermarkify(2008, 2022, "HVL"));
		System.out.println(LocalDate.now().getYear()); 
		
		String str = "Hello there";
		System.out.println(str.substring(5));

	}

}
