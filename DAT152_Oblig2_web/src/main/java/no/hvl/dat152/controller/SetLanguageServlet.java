package no.hvl.dat152.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;


/**
 * Servlet implementation class SetLanguageServlet.
 */
@WebServlet("/SetLanguage")
public class SetLanguageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	System.out.println("HEI!!!!");
//        String locale = request.getParameter("locale");
//        if (locale != null) {
//            Config.set(request.getSession(), Config.FMT_LOCALE, locale);
//
//            Cookie localeCookie = new Cookie("locale", locale);
//            localeCookie.setMaxAge(365 * 24 * 60 * 60); // One year in seconds
//            response.addCookie(localeCookie);
//            // Cookie with locale sent to client
//        }
//
//        String referrer = request.getHeader("referer");
//        response.sendRedirect(referrer);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
