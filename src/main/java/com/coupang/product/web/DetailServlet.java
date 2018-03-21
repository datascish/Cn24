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

@WebServlet("/detail")
public class DetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	// 객체 선언
	private ProductDao productDao;
	
    public DetailServlet() {
    		// 인스턴스
    		productDao = ProductDao.getInstance();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// doPost로 전달
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// parameter(id) 받아오기
		String idStr = request.getParameter("id"); //type 문자열 주의
		// idStr == null
		if ( idStr == null) {
			idStr = "";
		}
		// 예외 처리
		int id = 0;
		try {
			id = Integer.parseInt(idStr);
		}
		catch ( NumberFormatException nfe) {
			id = 0;
		}
		
		ProductVO product = productDao.get(id);
		
		// jsp로 전달
		request.setAttribute("detail", product);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/view/detail.jsp");
		rd.forward(request, response);
		
	}

}
