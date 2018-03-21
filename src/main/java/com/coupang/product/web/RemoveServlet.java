package com.coupang.product.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coupang.product.dao.ProductDao;

@WebServlet("/remove")
public class RemoveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ProductDao productDao;
	
	public RemoveServlet() {
		productDao = ProductDao.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String idStr = request.getParameter("id");
		int id = 0;
		try {
			id = Integer.parseInt(idStr);
		}
		catch (NumberFormatException nfe) {
			id = 0;
		}
		
		productDao.remove(id);
		
		response.sendRedirect("/Coupang/list");
		
	}

}
