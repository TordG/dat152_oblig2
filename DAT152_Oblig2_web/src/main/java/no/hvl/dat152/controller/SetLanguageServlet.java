package no.hvl.dat152.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.jstl.core.Config;


/**
 * Servlet implementation class SetLanguageServlet.
 */
@WebServlet("/SetLanguage")
public class SetLanguageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        String locale = request.getParameter("locale");
        if (locale != null) {
            Config.set(request.getSession(), Config.FMT_LOCALE, locale);

            Cookie localeCookie = new Cookie("locale", locale);
            localeCookie.setMaxAge(365 * 24 * 60 * 60); // One year in seconds
            response.addCookie(localeCookie);
            // Cookie with locale sent to client
        }

        String referrer = request.getHeader("referer");
        response.sendRedirect(referrer);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
