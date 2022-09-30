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
import no.hvl.dat152.model.Cart;
import no.hvl.dat152.util.Util;


@WebServlet(name = "CartServlet", urlPatterns = "/cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String locale = (String) Config.get(request.getSession(), Config.FMT_LOCALE); 
		WebStoreDAO productDAO = new WebStoreDAO();
		
		// Convert descriptions and prices
		Cart.staticItems = Util.convertDescription(Cart.staticItems, productDAO.getAllDescriptions(), locale);
		Cart.staticItems = Util.convertPrice(Cart.staticItems, locale);
		
		LanguageDAO languageDAO = new LanguageDAO();
		request.setAttribute("supportedLanguages", languageDAO.getSupportedLanguages());
		
		Cart cart = new Cart();
		
		request.setAttribute("cart", cart);
		
		getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
		
	}

	
	

}
