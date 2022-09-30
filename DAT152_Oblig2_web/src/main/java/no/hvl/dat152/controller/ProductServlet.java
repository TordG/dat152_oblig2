package no.hvl.dat152.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.jstl.core.Config;
import no.hvl.dat152.db.LanguageDAO;
import no.hvl.dat152.db.WebStoreDAO;
import no.hvl.dat152.util.Util;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LanguageDAO languageDAO = new LanguageDAO();
		request.setAttribute("supportedLanguages", languageDAO.getSupportedLanguages());
		
		WebStoreDAO productDAO = new WebStoreDAO();

		String locale = (String) Config.get(request.getSession(), Config.FMT_LOCALE); 
		
		request.setAttribute("products", Util.convertAllProducts(productDAO.getAllProducts(),
				productDAO.getAllDescriptions(), locale));
		
		getServletContext().getRequestDispatcher("/products.jsp").forward(request, response);

	}

}
