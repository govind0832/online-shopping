package net.go.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.go.shoppingbackend.dao.CategoryDAO;
import net.go.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category category = new Category();

		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("Great TV");
		category.setImgaeUrl("tv.png");

		categories.add(category);

		// adding second category
		category = new Category();
		category.setId(2);
		category.setName("Laptop");
		category.setDescription("Great laptop");
		category.setImgaeUrl("laptop.png");

		categories.add(category);

		// adding third category
		category = new Category();
		category.setId(3);
		category.setName("Mobile");
		category.setDescription("Great Mobile");
		category.setImgaeUrl("mobile.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		
		//enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
				
		}
		
		return null;
	}

}
