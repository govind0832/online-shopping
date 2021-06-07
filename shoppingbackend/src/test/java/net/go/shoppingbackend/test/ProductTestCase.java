package net.go.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.go.shoppingbackend.dao.ProductDAO;
import net.go.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	
	@BeforeClass
	public static void inti() {
	context = new AnnotationConfigApplicationContext();
	context.scan("net.go.shoppingbackend");
	context.refresh();
	productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	
//	@Test
//	public void testCURDProduct() {
//		
//		//create Product
//		product = new Product();
//		
//		product.setName("oppo selfie");
//		product.setBrand("Oppo");
//		product.setDescription("Grat");
//		product.setUnitprice(23000);
//		product.setActive(true);
//		product.setCategoryId(3);
//		product.setSupplierid(3);
//		
//		
//		assertEquals("Something went wrong", true, productDAO.add(product));
//		
//		//reading and updating
//		product = productDAO.get(2);
//		product.setName("Samsung");
//		assertEquals("Somrthing went worng", true, productDAO.update(product));
//		
//		//Deleting
//		assertEquals("Somthing went worng", true, productDAO.delete(product));
//		
//		//list
//		assertEquals("Somthing went worng", 6,productDAO.list().size());
//		
//		
//	}
	
	@Test
	public void testListActiveProducts() {
		assertEquals("Something went worng", 5,productDAO.listActiveProduct().size());
	}
	
	
	@Test
	public void testListActiveProductsByCategory() {
		assertEquals("something went worng", 3,productDAO.listActiveProductByCategory(3).size());
	assertEquals("Something went worng", 2,productDAO.listActiveProductByCategory(1).size());
	}
	
	
	
	@Test
	public void testGetLatestActiveProduct() {
		assertEquals("Something went worng", 3,productDAO.getLatestActiveProducts(3).size());
	}
	
}
