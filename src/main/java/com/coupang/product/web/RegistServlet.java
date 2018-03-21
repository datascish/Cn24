package com.coupang.product.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coupang.product.dao.ProductDao;
import com.coupang.product.vo.ProductVO;

@WebServlet("/regist")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProductDao productDao;

	public RegistServlet() {
		productDao = ProductDao.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/regist.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String brand = request.getParameter("brand");
		String productName = request.getParameter("productName");
		String priceStr = request.getParameter("price");
		String discountStr = request.getParameter("discount");

		int price;
		int discount;

		try {
			price = Integer.parseInt(priceStr);
		} catch (NumberFormatException nfe) {
			price = 0;
		}
		try {
			discount = Integer.parseInt(discountStr);
		} catch (NumberFormatException nfe) {
			discount = 0;
		}
		
		ProductVO productVO = new ProductVO();
		productVO.setBrand(brand);
		productVO.setProductName(productName);
		productVO.setPrice(price);
		productVO.setDiscount(discount);
		
		productDao.save(productVO);
		
		response.sendRedirect("/Coupang/list");
	}

}
