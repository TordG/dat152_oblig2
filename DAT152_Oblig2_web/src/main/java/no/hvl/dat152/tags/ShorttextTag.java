package no.hvl.dat152.tags;

import java.io.IOException;
import java.io.StringWriter;


import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.PageContext;
import jakarta.servlet.jsp.tagext.JspFragment;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class ShorttextTag extends SimpleTagSupport {
	
	private int maxchars = 0;

	
	

	public void setMaxchars(int maxchars) {
		this.maxchars = maxchars;
	}
	
	
	
	public final void doTag() throws JspException, IOException {

		PageContext pageContext = (PageContext) getJspContext();
		JspWriter out = pageContext.getOut();
		JspFragment body = getJspBody();
		StringWriter stringWriter = new StringWriter();
		body.invoke(stringWriter);
		String bodyText = stringWriter.getBuffer().toString();
		
		if (bodyText.length() > maxchars) {
			out.println(bodyText.substring(0,maxchars) + " ...");
		} else {
			out.println(bodyText);
		}
		
		
		
		
	
	}

}
