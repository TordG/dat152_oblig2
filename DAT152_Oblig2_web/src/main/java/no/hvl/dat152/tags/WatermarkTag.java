package no.hvl.dat152.tags;

import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDate;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class WatermarkTag extends SimpleTagSupport {
	
	
	private int since = 0;
//	private String org = "";
	
	

	public void setSince(int since) {
		this.since = since;
	}

	

//	public void setOrg(String org) {
//		this.org = org;
//	}

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



	public final void doTag() throws JspException, IOException {

		PageContext pageContext = (PageContext) getJspContext();
		JspWriter out = pageContext.getOut();
		JspFragment body = getJspBody();
		StringWriter stringWriter = new StringWriter();
		body.invoke(stringWriter);
		String bodyText = stringWriter.getBuffer().toString();
		
		out.println("<i>");
		out.println("© " + intToRoman(since) + "-" + intToRoman(LocalDate.now().getYear()) + " " + bodyText);
		out.println("</i>");
	}

}
