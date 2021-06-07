package net.go.shoppingbackend.dao;

import java.util.List;

import net.go.shoppingbackend.dto.Product;

public interface ProductDAO {

	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	
	//Business methods
	List<Product> listActiveProduct();
	List<Product> listActiveProductByCategory(int categoryId);
	List<Product> getLatestActiveProducts(int count);
	
	
	
}
