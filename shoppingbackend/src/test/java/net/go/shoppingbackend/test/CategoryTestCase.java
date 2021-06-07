package net.go.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.go.shoppingbackend.dao.CategoryDAO;
import net.go.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void init() {

		context = new AnnotationConfigApplicationContext();
		context.scan("net.go.shoppingbackend");
		context.refresh();

		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");

	}

//	@Test
//	public void testAddCategory() {
//		
//		category  = new Category();
//		
//		category.setName("Television");
//		category.setDescription("Greatygy6 TV");
//		category.setImgaeUrl("tv.png");
//		
//		assertEquals("Successfully added a category", true,categoryDAO.add(category));
//	}

//
//	@Test
//	public void testCategory() {
//		
//		category = categoryDAO.get(1);
//		
//		assertEquals("Successfully fetched a single category from the table","Television",category.getName());
//	}
//	

//	
//	@Test
//	public void testUpdateCategory() {
//		category = categoryDAO.get(1);
//		category.setName("TV");
//		assertEquals("Successfully updated a single category in the table", true,categoryDAO.update(category));
//	}
//	

//	@Test
//	public void testDeleteCategory() {
//		category = categoryDAO.get(1);
//		
//		assertEquals("Successfully updated a single category in the table", true,categoryDAO.delete(category));
//	}
//	

	// Test list Category
//	@Test
//	public void testListCategory() {
//		assertEquals("Successfully listed the cateory", 0, categoryDAO.list().size());
//
//	}
	
	

	// Test CURD
	@Test
	public void testCURDCategory() {

		// Add category
		category = new Category();

		category.setName("TV");
		category.setDescription("GreatTV");
		category.setImgaeUrl("tv.png");

		assertEquals("Successfully added a category", true, categoryDAO.add(category));

		category = new Category();

		category.setName("Fridge");
		category.setDescription("Great Fridge");
		category.setImgaeUrl("fridge.png");

		assertEquals("Successfully added a category", true, categoryDAO.add(category));

		// Get category
		category = categoryDAO.get(1);

		assertEquals("Successfully fetched a single category from the table", "TV", category.getName());

		// update Category
		category = categoryDAO.get(1);
		category.setName("TV");
		assertEquals("Successfully updated a single category in the table", true, categoryDAO.update(category));

		// Delete Category
		category = categoryDAO.get(1);
		assertEquals("Successfully updated a single category in the table", true, categoryDAO.delete(category));

		// List Category
		assertEquals("Successfully listed the cateory", 1, categoryDAO.list().size());

	}

}
