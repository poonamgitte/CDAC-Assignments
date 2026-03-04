package org.SpringApp.web.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.SpringApp.web.Entity.Category;
import org.springframework.jdbc.core.RowMapper;

public class CategoryRowMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {

		Category objCategory = new Category();
		
		objCategory.setCategoryId(rs.getInt(1));
		objCategory.setCategoryName(rs.getString(2));
		objCategory.setCategoryDescription(rs.getString(3));
		objCategory.setCategoryImage(rs.getString(4));
		
		
		return objCategory;
	}

}
