package com.shopNest.customer;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shopNest.dbHandler.DataInjector;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		try {
			String username=req.getParameter("username");
			String email=req.getParameter("email");
			String password=req.getParameter("password");
			String gender=req.getParameter("radio");
			String address=req.getParameter("address");
			String status=DataInjector.addCustomer(username, email, password, gender, address);
			res.sendRedirect("login.jsp");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
