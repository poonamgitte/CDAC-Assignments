package org.SpringApp.web.dao;

import java.util.Iterator;

import javax.annotation.PostConstruct;

import org.SpringApp.web.Entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:application.properties")
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String sqlCategoryInsert;
	String sqlCategoryFindById;
	String sqlCategoryFindAll;
	
	
	@Autowired
	Environment env;
	
	
	@PostConstruct
	public void init() {
		sqlCategoryInsert = env.getProperty("sql.category.insert");
		sqlCategoryFindAll = env.getProperty("sql.category.findAll");
		sqlCategoryFindById = env.getProperty("sql.category.findById");
	}
	
	@Override
	public void addCategory(Category objCategory) {
		
		jdbcTemplate.update(sqlCategoryInsert, 
				objCategory.getCategoryId(),
				objCategory.getCategoryName(),
				objCategory.getCategoryDescription(),
				objCategory.getCategoryImage());
		
	}

	@Override
	public void deleteCategory(int categoryId) {
		
		
	}

	@Override
	public Category findById(int categoryId) {
		
		return null;
	}

	@Override
	public Iterator<Category> findAll() {
		
		return jdbcTemplate.query(sqlCategoryFindAll, 
			new CategoryRowMapper()).iterator();
	}

	@Override
	public String toString() {
		return "CategoryDAOImpl [jdbcTemplate=" + jdbcTemplate + ", sqlCategoryInsert=" + sqlCategoryInsert
				+ ", sqlCategoryFindById=" + sqlCategoryFindById + ", sqlCategoryFindAll=" + sqlCategoryFindAll
				+ ", env=" + env + "]";
	}
	
	

}
