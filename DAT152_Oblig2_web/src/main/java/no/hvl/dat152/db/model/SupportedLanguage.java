package no.hvl.dat152.db.model;

public class SupportedLanguage {
	
	private String language;
	private String langCode;

	public SupportedLanguage(String language, String langCode) {
		this.language = language;
		this.langCode = langCode;
	}
	
	public String getLanguage() {
		return language;
	}

	public String getLangCode() {
		return langCode;
	}
	
}
