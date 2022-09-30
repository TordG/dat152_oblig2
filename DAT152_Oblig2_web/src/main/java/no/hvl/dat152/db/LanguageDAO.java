package no.hvl.dat152.db;

import java.util.ArrayList;
import java.util.List;

import no.hvl.dat152.db.model.SupportedLanguage;

public class LanguageDAO {
	
	private List<SupportedLanguage> supportedLanguages = new ArrayList<SupportedLanguage>();
	
	public LanguageDAO() {
		SupportedLanguage en_US = new SupportedLanguage("English (US)", "en_US");
		SupportedLanguage de_DE = new SupportedLanguage("Deutsch", "de_DE");
		SupportedLanguage no_NO = new SupportedLanguage("Norsk", "no_NO");
		
		supportedLanguages.add(en_US);
		supportedLanguages.add(de_DE);
		supportedLanguages.add(no_NO);
	}
	
	public List<SupportedLanguage> getSupportedLanguages() {
		return supportedLanguages;
	}

}
