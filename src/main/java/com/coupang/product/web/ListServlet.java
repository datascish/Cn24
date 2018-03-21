package com.coupang.product.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coupang.product.dao.ProductDao;
import com.coupang.product.vo.ProductVO;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private ProductDao productDao;
	
    public ListServlet() {
    		productDao= ProductDao.getInstance();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<ProductVO> productList = productDao.getAll();
		
		request.setAttribute("productList", productList);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/list.jsp");
		rd.forward(request, response);
		
	}

}
