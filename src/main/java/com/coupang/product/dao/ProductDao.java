package com.coupang.product.dao;

import java.util.ArrayList;
import java.util.List;

import com.coupang.product.vo.ProductVO;

public class ProductDao {
private static ProductDao ProductDao;
	
	private List<ProductVO> productList;
	private int id;
	
	private ProductDao() {
//		ProductDao = new ProductDao();
		
		productList = new ArrayList<ProductVO>();
		
		ProductVO product = new ProductVO();
		product.setId(++id);
		product.setBrand("구내식당");
		product.setDiscount(20);
		product.setPrice(3500);
		product.setProductName("완두콩밥");
		productList.add(product);
		
		product = new ProductVO();
		product.setId(++id);
		product.setBrand("구내식당");
		product.setDiscount(20);
		product.setPrice(3500);
		product.setProductName("완두콩밥");
		productList.add(product);
		
		product = new ProductVO();
		product.setId(++id);
		product.setBrand("구내식당");
		product.setDiscount(20);
		product.setPrice(3500);
		product.setProductName("완두콩밥");
		productList.add(product);
	}
	
	public static ProductDao getInstance() {
		if ( ProductDao == null ) {
			ProductDao = new ProductDao();
		}
		return ProductDao;
	}
	
	public void save(ProductVO ProductVO) {
		ProductVO.setId(++id);
		productList.add(ProductVO);
	}
	
	public ProductVO get(int id) {
		for ( ProductVO article : productList ) {
			if ( id == article.getId() ) {
				return article;
			}
		}
		return null;
	}
	
	public List<ProductVO> getAll() {
		return productList;
	}
	
	public boolean remove(int id) {
		for ( ProductVO article : productList ) {
			if ( id == article.getId() ) {
				productList.remove(article);
				return true;
			}
		}
		
		return false;
	}
	
}

