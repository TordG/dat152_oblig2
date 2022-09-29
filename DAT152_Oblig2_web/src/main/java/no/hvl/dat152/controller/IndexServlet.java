package no.hvl.dat152.controller;


import java.io.IOException;

import java.util.Locale;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.jstl.core.Config;

@WebServlet(name = "IndexServlet", urlPatterns = "/index")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("locale")) {
                    // Set locale from cookie
                    Config.set(request.getSession(), Config.FMT_LOCALE, cookie.getValue());
                }
            }
        } else {
            Locale locale = request.getLocale();

//            Config.set(request.getSession(), Config.FMT_LOCALE, locale.getLanguage() + "_" + locale.getCountry());
            Config.set(request.getSession(), Config.FMT_LOCALE, locale.getLanguage());

//            Cookie localeCookie = new Cookie("locale", locale.getLanguage() + "_" + locale.getCountry());
            Cookie localeCookie = new Cookie("locale", locale.getLanguage());
            localeCookie.setMaxAge(365 * 24 * 60 * 60); // One year in seconds
            response.addCookie(localeCookie);
            // Cookie with locale sent to client
        }
		
		
		getServletContext().getRequestDispatcher("/home.jsp").forward(request, response);
	}

}
