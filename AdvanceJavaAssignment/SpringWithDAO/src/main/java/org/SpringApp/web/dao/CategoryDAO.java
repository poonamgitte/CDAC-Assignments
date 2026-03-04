package org.SpringApp.web.dao;

import java.util.Iterator;

import org.SpringApp.web.Entity.Category;

public interface CategoryDAO {

	public void addCategory(Category objCategory) ;
	public void deleteCategory(int categoryId);
	public Category findById(int categoryId);
	public Iterator<Category> findAll();
	
	
}
