package com.shopNest.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/log")
public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
			String username=req.getParameter("username");
			String password=req.getParameter("password");
			Validator vd=new Validator();
			boolean val=Validator.isValid(username, password);
			if(val==true&&username.equals("admin")) {
				res.sendRedirect("admin1.jsp");
			}
			else if(val==true) {
				res.sendRedirect("home.jsp");
			}
			else {
				res.sendRedirect("login.jsp");
			}
	}

}
