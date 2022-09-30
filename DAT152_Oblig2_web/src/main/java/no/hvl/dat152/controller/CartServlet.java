package no.hvl.dat152.controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import no.hvl.dat152.db.LanguageDAO;


@WebServlet(name = "CartServlet", urlPatterns = "/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		LanguageDAO languageDAO = new LanguageDAO();
		request.setAttribute("supportedLanguages", languageDAO.getSupportedLanguages());
		
		
		
		
		getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
		
	}

	
	

}
