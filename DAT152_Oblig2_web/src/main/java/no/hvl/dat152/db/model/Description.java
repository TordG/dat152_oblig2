package no.hvl.dat152.db.model;

public class Description {
	
	private int pno;
	private String langCode;
	private String text;
	
	public Description(int pno, String langCode, String text) {
		this.pno = pno;
		this.langCode = langCode;
		this.text = text;
	}

	public int getPno() {
		return pno;
	}

	public String getLangCode() {
		return langCode;
	}

	public String getText() {
		return text;
	}
	
	
	
	
	

}
