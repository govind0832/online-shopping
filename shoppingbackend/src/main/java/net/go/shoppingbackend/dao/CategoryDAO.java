package net.go.shoppingbackend.dao;

import java.util.List;

import net.go.shoppingbackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	
	Category get(int id);
	
	
}
